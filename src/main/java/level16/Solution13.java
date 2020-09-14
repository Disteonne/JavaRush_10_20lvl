
package level16;

public class Solution13 {
    public static int count=4;
    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < count; i++) {
            new SleepingThread().join();

            //Thread.currentThread().interrupt();
        }
    }
    public static class SleepingThread extends Thread{
        private static volatile int threadCount=0;
        private static volatile int countDownIndex=count;
        SleepingThread() throws InterruptedException{
            super(String.valueOf(++threadCount));
            start();
        }

        @Override
        public void run() {

            while (true){
                System.out.println(this);
                if(countDownIndex==0){
                    return;
                }
                try {
                    countDownIndex--;
                    System.out.println(countDownIndex);
                    Thread.sleep(10);
                }catch (InterruptedException e){
                    //e.getStackTrace();
                    System.out.println("нить прервана");
                }
            }
        }

        @Override
        public String toString() {
            return "#"+getName()+" "+countDownIndex;
        }
    }
}
