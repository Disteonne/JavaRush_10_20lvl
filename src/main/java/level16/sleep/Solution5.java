package level16.sleep;

public class Solution5 {
    public static void main(String[] args) throws  InterruptedException{
        Clock clock=new Clock();
        clock.start();
        Thread.sleep(2000);
        clock.cancel();
    }
    static class Clock extends Thread{
        private boolean isStoped=false;
        public void cancel(){
            isStoped=true;
        }

        @Override
        public void run() {
            try {
                while (!isStoped) {
                    Thread.sleep(1000);
                    System.out.println("Sleep");
                }
            }catch (InterruptedException ex){
                ex.getStackTrace();
            }
        }
    }
}
