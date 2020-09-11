package level16;

public class Solution1 {
    public static void main(String[] args) {
    TestThread testThread=new TestThread();
    //Thread thread=new Thread(testThread);
    //thread.start();
        testThread.start();
    }
    public static class TestThread extends  Thread{
        static {
            System.out.println("it's a static block inside TestThread");
        }

        @Override
        public void run() {
            System.out.println("it's a run method");
        }
    }
}
