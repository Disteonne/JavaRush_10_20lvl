package level16;

import java.util.ArrayList;
import java.util.List;

public class Solution2 {
    public static volatile List<Thread> list=new ArrayList<>(5);
    public static void main(String[] args) {
    SpecialThread specialThread=new SpecialThread();
    Thread thread=new Thread(specialThread);
    SpecialThread specialThread1=new SpecialThread();
    Thread thread1=new Thread(specialThread1);
    SpecialThread specialThread2=new SpecialThread();
    Thread thread2=new Thread(specialThread2);
    SpecialThread specialThread3=new SpecialThread();
    Thread thread3=new Thread(specialThread3);
    SpecialThread specialThread4=new SpecialThread();
    Thread thread4=new Thread(specialThread4);
    list.add(thread);
    list.add(thread1);
    list.add(thread2);
    list.add(thread3);
    list.add(thread4);

    System.out.println(list);
    }
    public static class SpecialThread implements Runnable{
        public void run() {
            System.out.println("yep,its me");
        }
    }

}
