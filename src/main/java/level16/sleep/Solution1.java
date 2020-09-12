package level16.sleep;

public class Solution1 {
    private static boolean isStoped = false;

    public static void main(String[] args) {
        Runner runner = new Runner("Nicole", 3);
        Runner runner1 = new Runner("Kate", 5);
        runner.start();
        runner1.start();

    }

    public static class StopWatch extends Thread {
        private Runner owner;
        private int stepCount;

        StopWatch(Runner runner) {
           this.owner=runner;
        }

        @Override
        public void run() {
            try {
                while (!isStoped) {
                    doStep();
                }
            } catch (InterruptedException ex) {
                ex.getStackTrace();
            }
        }

        private void doStep() throws InterruptedException {
            long l = 1000 / owner.speed;
            Thread.sleep(l);
            stepCount++;
            System.out.println("шаг номер " + stepCount);
        }
    }

    public static class Runner {
        StopWatch stopWatch;
        private String name;
        private int speed;

        public Runner(String name, int speed) {
            this.name = name;
            this.speed = speed;
            stopWatch = new StopWatch(this);
        }

        public String getName() {
            return name;
        }

        public int getSpeed() {
            return speed;
        }

        public void start() {
            stopWatch.start();
        }
    }
}
