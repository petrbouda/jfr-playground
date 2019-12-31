package pbouda.jfr;

import jdk.jfr.Configuration;
import jdk.jfr.consumer.EventStream;
import jdk.jfr.consumer.RecordingStream;

import java.io.IOException;
import java.nio.file.Path;
import java.text.ParseException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Jfr {

    public static void main(String[] args) throws InterruptedException {
        Jfr.start("jdk.LongFlag");
        Thread.currentThread().join();
    }

    public static void start(String... events) {
        Configuration config;
        try {
            config = Configuration.create(Path.of("custom-profile.xml"));
            // config = Configuration.getConfiguration("profile");
        } catch (IOException | ParseException e) {
            throw new RuntimeException(e);
        }

        System.out.println(config.getDescription());
        System.out.println("settings:");
        config.getSettings().forEach((key, value) -> System.out.println(key + ": " + value));

        ExecutorService executor = Executors.newSingleThreadExecutor(new NamedThreadFactory("jfr"));
        executor.submit(() -> {
            try (EventStream es = new RecordingStream(config)) {
                for (String event : events) {
                    es.onEvent(event, System.out::println);
                }

                Runtime.getRuntime().addShutdownHook(new Thread(() -> {
                    try {
                        es.awaitTermination();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }));

                es.start();
            }
        });
    }
}
