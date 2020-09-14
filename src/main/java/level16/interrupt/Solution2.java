package level16.interrupt;

public class Solution2 {
    public static void main(String[] args) throws  InterruptedException{
    TestThread testThread=new TestThread();
    testThread.start();
    Thread.sleep(5000);
    testThread.changeStatus();
    }

    static class TestThread extends  Thread{
      private static   boolean b=true;
        @Override
        public void run() {

            try {
                while (b){
                    Thread.sleep(500);
                    System.out.println("he-he");
                }
            }catch (InterruptedException ex){
                ex.getStackTrace();
            }
        }
        public void changeStatus(){
           TestThread.b=false;
        }
    }
}
