package level16;

public class Solution16 {
    public static T1 t1 = new T1();
    public static T2 t2 = new T2();

    public static void main(String[] args) {
        t1.start();
        //t2.start();<---взаимная блокировка дэдблок
        t1.interrupt();
        t2.start();
    }

    public static class T1 extends Thread {
        @Override
        public void run() {
            try {
                t2.join();
                System.out.println("t1 завершился");
            } catch (InterruptedException ex) {
                System.out.println("t1 was interrupted");
            }
        }
    }

    public static class T2 extends Thread {
        @Override
        public void run() {
            try {
                t1.join();
                System.out.println("t2 завершился");
            } catch (InterruptedException e) {
                System.out.println("t2 was interrupted");
            }
        }
    }
}
