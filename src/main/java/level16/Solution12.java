package level16;

public class Solution12 {
    static int count=5;
    public static void main(String[] args) throws InterruptedException{
    ThreadNamesPrint threadNamesPrint=new ThreadNamesPrint();
    threadNamesPrint.start();
        for (int i = 0; i < 5; i++) {
            ThreadNamesPrint.printMsg();
        }
    }
    public static class ThreadNamesPrint extends Thread{
        @Override
        public void run() {
            for (int i = 0; i < count; i++) {
                try {
                    printMsg();
                }catch (InterruptedException e){
                    e.getStackTrace();
                }
            }
        }

        public static void printMsg() throws InterruptedException{
            Thread t=Thread.currentThread();
            System.out.println(t.getName());
            Thread.sleep(1);
        }
    }
}
