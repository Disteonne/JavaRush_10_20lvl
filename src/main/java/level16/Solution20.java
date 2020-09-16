package level16;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Solution20 {
    public static volatile BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws InterruptedException {
        Read3Strings r1=new Read3Strings();
        Read3Strings r2=new Read3Strings();
        r1.start();
        r1.join();

        r2.start();
        r2.join();


        System.out.println(r1);
        System.out.println(r2);

    }
    public static class Read3Strings extends Thread{
        private List<String> result=new ArrayList<String>();
        int count=3;
        @Override
        public void run() {
            try {
                while (count > 0) {
                    result.add(bufferedReader.readLine());
                    count--;
                }
            }catch (IOException e){

            }
        }

        @Override
        public String toString() {
            return result.get(0)+" "+result.get(1)+" "+result.get(2);
        }
    }
}
