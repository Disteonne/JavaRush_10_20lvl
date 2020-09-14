package level16.sleep;

public class Solution6 {
    public static void main(String[] args) throws InterruptedException {
    Clock clock=new Clock();
    Thread clockInter=new Thread(clock);
    clockInter.start();


    Thread.sleep(4999);
        clockInter.interrupt();

    }
    static class Clock implements Runnable{
        @Override
        public void run() {
            Thread current=Thread.currentThread();
            while (!current.isInterrupted()){ //isInter==false

                try {
                    Thread.sleep(1000);
                }catch (InterruptedException ex){
                    ex.getStackTrace();
                    System.out.println("error");
                    break;
                }


                System.out.println("sleep");
            }
        }

    }
}
