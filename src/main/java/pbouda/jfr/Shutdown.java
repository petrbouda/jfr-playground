package pbouda.jfr;

public class Shutdown {

    public static void main(String[] args) throws InterruptedException {
        Jfr.start("jdk.Shutdown");
        Thread.sleep(5_000);
        throw new RuntimeException("SCHLUSS");
    }

}
