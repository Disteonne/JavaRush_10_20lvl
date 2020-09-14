package level16.interrupt;


public class Solution {
    public static void main(String[] args) throws InterruptedException {
        Stopwatch stopwatch = new Stopwatch();
        stopwatch.start();
        Thread.sleep(5005);
        stopwatch.interrupt();
        System.out.println(stopwatch.seconds);
    }

    public static class Stopwatch extends Thread {
        int seconds = 0;

        @Override
        public void run() {
            stopWatch();
        }

        public void stopWatch() {
            try {
                while (!isInterrupted()) {
                    Thread.sleep(1000);
                    seconds++;
                }
            } catch (InterruptedException ex) {
                ex.getStackTrace();
            }
        }
    }
}
