package level16.interrupt;

import java.lang.reflect.Array;

import java.util.ArrayList;
import java.util.List;

public class Solution3 {
    public static byte threadCount = 3;
    public static List<Thread> list = new ArrayList<Thread>(threadCount);

    public static void main(String[] args) throws InterruptedException{
    initThreadAndStart();
    Thread.sleep(3000);
    ourInter();
    }

    private static void initThreadAndStart() {
        Water water = new Water("Water ");
        for (int i = 0; i < threadCount; i++) {
            list.add(new Thread(water, "#" + i));
        }
        for (int i = 0; i < list.size(); i++) {
            list.get(i).start();

        }
    }

    private static void ourInter() {
        for (int i = 0; i < threadCount; i++) {
            list.get(i).interrupt();
        }
    }

    public static class Water implements Runnable {
        private String resource;

        public Water(String resource) {
            this.resource = resource;
        }

        @Override
        public void run() {
            boolean isCurrentThreadInterrupted = Thread.currentThread().isInterrupted();
            String currentName = Thread.currentThread().getName();
            try {
                while (!isCurrentThreadInterrupted) {
                    System.out.println("Объект " + getClass().getName() + " Нить " + currentName);
                    Thread.sleep(1000);
                }
            } catch (InterruptedException ex) {
                ex.getStackTrace();
            }

        }
    }
}
