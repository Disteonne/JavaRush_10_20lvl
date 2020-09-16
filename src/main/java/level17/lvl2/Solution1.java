package level17.lvl2;

import java.util.ArrayList;
import java.util.List;

public class Solution1 {
    public static int threadCount=10;
    public static int[] testArray=new int[1000];
    public static int temp;
    static {
        for (int k = 0; k < Solution1.testArray.length; k++) {
            testArray[k]=k;
        }
    }
    public static void main(String[] args) throws InterruptedException {
        StringBuffer stringBuffer=new StringBuffer();
        for (int i = 1000-1; i >=0 ; i--) {
        stringBuffer.append(i).append(" ");
        }

        initThreads();

        StringBuffer result=new StringBuffer();
        for (int i = 0; i < testArray.length; i++) {
            result.append(testArray[i]).append(" ");
        }
        System.out.println(result);
        System.out.println((result.toString()).equals(stringBuffer.toString()));

    }
    public static synchronized void sort(){

        for (int i = 0; i < testArray.length-1; i++) {
            for (int j = i+1; j < testArray.length; j++) {
               if(testArray[j]>testArray[i]){
                   temp=testArray[j];
                   testArray[j]=testArray[i];
                   testArray[i]=temp;
               }
            }
        }


    }
    public static void  initThreads() throws InterruptedException{
        List<Thread> threadList=new ArrayList<Thread>();
        for (int i = 0; i < 10; i++) {
            threadList.add(new SortedList());
        }
        for (int i = 0; i < threadList.size(); i++) {
            threadList.get(i).start();
        }
        for (int i = 0; i < threadList.size(); i++) {
            threadList.get(i).join();
        }
    }
    public static class SortedList extends Thread{
        @Override
        public void run() {
            sort();
        }
    }

}
