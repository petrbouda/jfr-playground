package pbouda.jfr;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileJFR {

    public static void main(String[] args) throws IOException, InterruptedException {
//        Jfr.start("jdk.FileRead", "jdk.FileWrite", "jdk.FileForce");
        Jfr.start("jdk.NativeMethodSample");
        Path movie = Path.of("/home/pbouda/movie.avi");

        Thread.sleep(5_000);

        byte[] bytes = Files.readAllBytes(movie);

        Thread.sleep(5_000);

        Files.write(Path.of("/home/pbouda/copy.avi"), bytes);

        Thread.sleep(5_000);

        System.out.println("COMPLETED - " + bytes.length);
    }
}
