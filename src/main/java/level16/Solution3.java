package level16;

public class Solution3 {
    public static void main(String[] args) {
        SpecialThread specialThread = new SpecialThread();
        Thread thread = new Thread(specialThread);
        thread.start();
        System.out.println("*******************************");
        for (StackTraceElement stackTraceElement : Thread.currentThread().getStackTrace()
        ) {
            System.out.println(stackTraceElement);
        }
    }

    public static class SpecialThread implements Runnable {
        public void run() {
            for (StackTraceElement stackTraceElement : Thread.currentThread().getStackTrace()
            ) {
                System.out.println(stackTraceElement);
            }
        }
    }
}
