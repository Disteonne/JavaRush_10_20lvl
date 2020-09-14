package level16.control2;


public class Solution {
    public static Thread.UncaughtExceptionHandler handler=new OurUncaughtExceptionHandler();
    public static void main(String[] args) {
        TestedThread testedThread=new TestedThread(handler);
        Thread thread1=new Thread(testedThread,"нить 1");
        thread1.setUncaughtExceptionHandler(handler);
        Thread thread2=new Thread(testedThread,"нить 2");
        thread2.setUncaughtExceptionHandler(handler);

        thread1.start();
        thread2.start();

        thread1.interrupt();
        thread2.interrupt();


    }
    public static class TestedThread extends Thread{
        public TestedThread(Thread.UncaughtExceptionHandler handler){
            setUncaughtExceptionHandler(handler);
            start();
        }

        @Override
        public void run() {
            try {
                Thread.sleep(3000);
            }catch (InterruptedException ex){
                throw  new RuntimeException("my ex mess");
            }
        }
    }
    public static class OurUncaughtExceptionHandler implements Thread.UncaughtExceptionHandler{
        public void uncaughtException(Thread t, Throwable e) {
           System.out.println(t.getName()+" "+e.getMessage());
        }
    }
}
