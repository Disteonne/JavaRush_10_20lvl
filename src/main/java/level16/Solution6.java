package level16;

import java.util.ArrayList;
import java.util.List;

public class Solution6 {
    public static void main(String[] args) throws InterruptedException {
        List<Horse> list = prepareHorsesAndStart(10);
        while (calculator(list) != list.size()) {

        }
    }

    public static int calculator(List<Horse> list) throws InterruptedException {
        int finishCount = 0;
        for (int i = 0; i < list.size(); i++) {
            if (!list.get(i).isFinish) {
                System.out.println("Waiting for " + list.get(i).getName());
                list.get(i).join();
            } else
                finishCount++;
        }
        return finishCount;
    }

    public static List<Horse> prepareHorsesAndStart(int horseCount) {
        List<Horse> list = new ArrayList<Horse>(horseCount);
        String number;
        for (int i = 0; i < horseCount; i++) {
            number = i < 10 ? ("0" + i) : "" + i;
            list.add(new Horse("Horse " + number));
        }
        for (int i = 0; i < horseCount; i++) {
            list.get(i).start();
        }
        return list;
    }

    public static class Horse extends Thread {
        private boolean isFinish;


        public Horse(String name) {
            super(name);
        }

        public boolean isFinish() {
            return isFinish;
        }

        @Override
        public void run() {
            String s = "";
            for (int i = 0; i < 1001; i++) {
                s += i;
                if (i == 1000) {
                    s = "finish!";
                    System.out.println(getName() + " " + s);
                    isFinish = true;
                }

            }
        }
    }
}
