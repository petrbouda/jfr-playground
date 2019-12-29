package pbouda.jfr;

public class MonitorEnter {

    public static void main(String[] args) {
        Jfr.start("jdk.CPUInformation");

//        while (true) {
//            innerMethod();
//        }
    }

    private static void innerMethod() {
        System.out.println("Protected Area - " + Thread.currentThread().getName());
        int i = 1;
        System.out.println(i);
    }
}
