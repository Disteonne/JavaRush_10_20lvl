package level16.sleep;

public class Solution {
    public static void main(String[] args)  throws  InterruptedException{
    Clock clock=new Clock();
    Thread.sleep(200000);
    System.out.println("stop");
    }
    private static void printTikTak() throws InterruptedException{
        System.out.println("tik");
        Thread.sleep(500);
        System.out.println("tak");
        Thread.sleep(500);
    }
    static class Clock extends Thread{
        public Clock(){
            setPriority(MAX_PRIORITY);
            start();
        }

        @Override
        public void run() {
            while (true){
                try {
                    printTikTak();
                }catch (InterruptedException e){
                    e.getStackTrace();
                }
            }
        }
    }
}
