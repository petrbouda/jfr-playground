package pbouda.jfr;

public class Exceptions {

    public static void main(String[] args) throws InterruptedException {
        Jfr.start("jdk.ExceptionStatistics", "jdk.JavaErrorThrow");

        while (true) {
            try {
               throw new Error("My Error");
            } catch (Error ex) {
            }

            Thread.sleep(1000);
        }
    }
}
