package pbouda.jfr;

import jdk.jfr.Configuration;
import jdk.jfr.consumer.EventStream;
import jdk.jfr.consumer.RecordingStream;

import java.io.IOException;
import java.text.ParseException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Basic {

    public static void main(String[] args) throws InterruptedException {
        Basic.start();
        Thread.currentThread().join();
    }

    public static void start() {
        ExecutorService executor = Executors.newSingleThreadExecutor(new NamedThreadFactory("jfr"));
        executor.submit(() -> {
            try {
                monitoring();
            } catch (IOException | ParseException e) {
                e.printStackTrace();
            }
        });
    }

    private static void monitoring() throws IOException, ParseException {
        Configuration config = Configuration.getConfiguration("profile");
        System.out.println(config.getDescription());
        System.out.println("settings:");
        config.getSettings().forEach((key, value) -> System.out.println(key + ": " + value));

        try (EventStream es = new RecordingStream(config)) {
            es.onEvent("jdk.SocketRead", System.out::println);
            es.onEvent("jdk.SocketWrite", System.out::println);
            es.onEvent("jdk.JVMInformation", System.out::println);
            es.start();
        }
    }
}
