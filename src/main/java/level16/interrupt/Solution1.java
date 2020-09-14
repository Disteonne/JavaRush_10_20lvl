package level16.interrupt;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;

public class Solution1 {
    private static int numSeconds=4;
    public static void main(String[] args) throws InterruptedException {
    RacingClock racingClock=new RacingClock();
    Thread.sleep(4005);
    racingClock.interrupt();

    }
    static class RacingClock extends Thread{
        public RacingClock(){
            super();
            start();
        }
        int countTime=0;
        @Override
        public void run() {

            ArrayList<Integer> tempList = new ArrayList<Integer>();
            if (numSeconds <= 3) {
                try {
                    while (!isInterrupted()) {
                        Thread.sleep(1000);
                        System.out.print(numSeconds+" ");
                        numSeconds--;
                        if (numSeconds==0) {
                            System.out.print(" Марш");
                        }

                    }
                } catch (InterruptedException ex) {
                    ex.getStackTrace();
                }
            }
            else if(numSeconds==4){
                try {
                    while (!isInterrupted()){
                        System.out.print(numSeconds+" ");
                        numSeconds--;
                        if(numSeconds==0){
                            System.out.print(" Прервано");
                        }
                        Thread.sleep(1000);
                    }
                }catch (InterruptedException e){
                    e.getStackTrace();
                }
            }
        }
    }
}
