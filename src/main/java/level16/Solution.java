package level16;

public class Solution {
    public static void main(String[] args) {
    Solution.TestThread testThread=new TestThread();
    Thread thread=new Thread(testThread);
    thread.start();
    }
    public static class TestThread implements Runnable{
        public void run() {
            System.out.println("My first thread");
        }
    }
}
