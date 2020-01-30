package tech.devolution;

import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        int i = 0;
        while (true) {
            System.out.println("I am simulating ling running process eg Tomcat. Iteration " + i);

            callSupervisedMethod();
            callNonSupervisedMethod();

            i++;
            Thread.sleep(TimeUnit.SECONDS.toMillis(5));
        }
    }

    @Trace
    private static void callNonSupervisedMethod() {
    }

    private static void callSupervisedMethod() {
    }
}
