package level16;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class Solution19 {
    public static volatile AtomicInteger atomicInteger=new AtomicInteger(0);
    public static volatile BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException,InterruptedException {
       int numb=Integer.parseInt(bufferedReader.readLine());

       ReaderThread thread1=new ReaderThread();
       ReaderThread thread2=new ReaderThread();
       ReaderThread thread3=new ReaderThread();
       thread1.start();
       thread2.start();
       thread3.start();
       while (numb>atomicInteger.get()){
       }
       System.out.println("#1 "+thread1);
       System.out.println("#2 "+thread2);
       System.out.println("#3 "+thread3);


       thread1.interrupt();
       thread2.interrupt();
       thread3.interrupt();

    }

    public static class ReaderThread extends Thread{
        private List<String> result=new ArrayList<>();

        @Override
        public void run() {
            try {
                while (!isInterrupted()) {
                    if(bufferedReader.ready()) {
                        String str = bufferedReader.readLine();
                        result.add(str);
                        atomicInteger.incrementAndGet();
                    }
                }

            }catch (IOException e){

            }
        }

        @Override
        public String toString() {
            return result.toString();
        }
    }
}
