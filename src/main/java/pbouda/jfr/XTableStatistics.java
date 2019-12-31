package pbouda.jfr;

public class XTableStatistics {

    public static void main(String[] args) throws InterruptedException {
        Jfr.start("jdk.ActiveRecording");

        Thread.sleep(5000);
    }

}
