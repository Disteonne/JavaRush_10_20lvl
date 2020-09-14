package level16.control1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution {
   static ArrayList<Thread> threadList=new ArrayList<Thread>();
    static {
        threadList.add(new ThreadExOne());
        threadList.add(new ThreadExTwo());
        threadList.add(new ThreadExThree());
        threadList.add(new ThreadExFour());
        threadList.add(new ThreadExFive());

    }
    public static void main(String[] args) {
    //threadList.get(0).start(); // <---работает верно
        /*
    ThreadExOne threadExOne=new ThreadExOne();
    threadExOne.start();
    threadExOne.setDaemon(true);//выполняется бесконечно
            Выдает IllegalThreadStateException

         */
    }
    public static class ThreadExOne extends Thread{
        @Override
        public void run() {
            while (true){

            }
        }
    }
    public static class ThreadExTwo extends Thread{
        @Override
        public void run() {
            try {
                Thread.sleep(100);
            }catch (InterruptedException ex){
                System.out.println("error");
            }
        }
    }
    public static class ThreadExThree extends Thread{
        @Override
        public void run() {
            try {
                Thread.sleep(500);
                System.out.println("Ура!");
            }catch (InterruptedException ex){
                ex.getStackTrace();
            }
        }
    }
    public static class ThreadExFour extends Thread implements  Message{
        public void showWarning() {
            System.out.println("ERROR!");
        }
        boolean flag=false;

        @Override
        public void run() {
            while (!flag){
                showWarning();
                flag=true;
            }
        }
    }
    public static class ThreadExFive extends Thread{
        int sum=0;
        String str;
        public void inputAndOutput(){
            BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));
            try {
                while (true){
                    str= bufferedReader.readLine();
                            if(str.equals("N")){
                                break;
                            }
                    sum+=Integer.parseInt(str);
                }
                System.out.println(sum);
            }catch (IOException ex){

            }
        }
    }
}
