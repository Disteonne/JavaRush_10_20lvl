package level16;

public class Solution14 {
    static int count = 15;
    static volatile int createCountThread = -1;

    public static void main(String[] args) {
        GenerateThread generateThread = new GenerateThread();
    }

    public static class GenerateThread extends Thread {
        GenerateThread() {
            super(" " + (++createCountThread));
            start();
        }

        @Override
        public void run() {
            if (createCountThread < Solution14.count) {
                System.out.println(new GenerateThread());
            }
        }

        @Override
        public String toString() {
            return createCountThread + " created";
        }
    }
}
