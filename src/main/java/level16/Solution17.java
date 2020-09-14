package level16;


public class Solution17 {
    public static int number = 5;

    public static void main(String[] args) {
    new Thread(new CountDownRunnable(),"Увеличиваем").start();

    }

    public static class CountDownRunnable implements Runnable {
        private int countIndex = 1;

        public void run() {
            try {
                while (true) {
                    Thread.sleep(500);
                    System.out.println(toString());
                    countIndex += 1;
                    if (countIndex == number) {
                        Thread.sleep(500);
                        System.out.println(toString());
                        return;
                    }
                }
            } catch (InterruptedException ex) {

            }

        }

        @Override
        public String toString() {
            return Thread.currentThread().getName() + " " + countIndex;
        }
    }
    public static class CountUpRunnable implements Runnable{
        private int index=1;

        public void run() {
            try {
                while (true){
                    Thread.sleep(500);
                    System.out.println(toString());
                    index++;
                    if(index==number){
                        return;
                    }
                }
            }catch (InterruptedException e){

            }
        }

        @Override
        public String toString() {
            return Thread.currentThread().getName()+" : "+index;
        }
    }
}
