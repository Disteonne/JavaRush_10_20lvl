package level16;

import java.text.DateFormat;
import java.util.Date;

public class Solution4 {
    public static void main(String[] args) {
    Violin violin=new Violin("скрипка");
    Thread thread=new Thread(violin);
    thread.start();
    }
    public  static int delay=100;
    public static void sleepNsec(int n){
        try {
            Thread.sleep(n*delay);
        }catch (InterruptedException ex){
            ex.getStackTrace();
        }
    }

    public interface MusicalInstr extends Runnable{
        Date startPlay();
        Date stopPlay();
    }
    public static class Violin implements MusicalInstr{
        private String owner;

        public Violin(String owner) {
            this.owner = owner;
        }

        public Date startPlay() {
            System.out.println(this.owner+" is playing");
            return new Date();
        }

        public Date stopPlay() {
            System.out.println(this.owner+" is stop playing");
            return new Date();
        }

        public void run() {
            Date start =startPlay();
            sleepNsec(4);
            Date stop=stopPlay();
            System.out.println("pl "+(stop.getTime()-start.getTime())+" ms");
        }
    }
}
