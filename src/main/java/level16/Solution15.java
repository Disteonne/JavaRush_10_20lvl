package level16;

public class Solution15 {
    public static MyThread myThread=new MyThread();
    public static void main(String[] args) throws InterruptedException {
    myThread.start();
    myThread.join();

        for (int i = 0; i < 5; i++) {
            System.out.println("main");
        }
    }
    public static class MyThread extends Thread{
        private String msg="inside MyThread";

        @Override
        public void run() {
            for (int i = 0; i < 10; i++) {
                System.out.println(msg+ i);
            }
        }
    }
}
