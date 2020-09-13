package level16.sleep;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Solution3 {
    private static boolean isStoped=false;
    public static void main(String[] args) {
       CountDown countDown=new CountDown(4);


    }
    private static class CountDown extends Thread{
        private int n;

        CountDown(int n){
            super();
            this.n=n;
            start();
        }

        public void getElement() throws  InterruptedException{
            ArrayList<Integer> list=new ArrayList<Integer>();
            list.add(5);
            list.add(8);
            list.add(10);
            list.add(1);
            list.add(20);

           if(n<list.size()){
               int i=1;
               while (n!=0){
                   Thread.sleep(500);
                   System.out.println(list.get(list.size()-i));
                   i++;
                   n--;
               }
           }

        }
        @Override
        public void run() {
            try {
                while (!isStoped) {
                    getElement();
                    if(n==0){
                        break;
                    }
                }
            }catch (InterruptedException ex){
                ex.getStackTrace();
            }
        }
    }
}
