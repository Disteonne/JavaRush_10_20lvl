package level16;

import java.util.ArrayList;
import java.util.List;

public class Solution18 {
    public static int count=0;
    public static void main(String[] args) {
    OnlineGame onlineGame=new OnlineGame();
    onlineGame.start();
    }
    public static class OnlineGame extends Thread{
        public static volatile boolean isWinnerFound=false;
        private static List<String> list=new ArrayList<>();
        static {
            list.add("Начало игры");
            list.add("Сбор результатов");
            list.add("Рост экономики");
            list.add("Убийство врагов");
        }

        protected Gamer gamer1=new Gamer("Ivanov",101);
        protected Gamer gamer2=new Gamer("Petrov",48);
        protected Gamer gamer3=new Gamer("Sidorov",21);

        @Override
        public void run() {
            gamer1.start();
            gamer2.start();
            gamer3.start();
            while (!isWinnerFound) {
            }
                gamer1.interrupt();
                gamer2.interrupt();
                gamer3.interrupt();

        }
    }
    public static class Gamer extends Thread{
        private int rating;
        Gamer(String name,int rating){
            super(name);
            this.rating=rating;
            //start();
        }

        @Override
        public void run() {
            boolean flag=true;

                for (int i = 0; i < OnlineGame.list.size()+1; i++) {
                    if(OnlineGame.isWinnerFound){
                    }
                    else if(i==4){
                        System.out.println(Thread.currentThread().getName()+" winner");
                        OnlineGame.isWinnerFound=true;
                    }
                    else {
                        try {

                            Thread.sleep(1000/rating);
                            System.out.println(getName()+" "+OnlineGame.list.get(i));
                            //count++; //БАГ!!!!!!!
                        }catch (InterruptedException e){
                                System.out.println(getName()+" проиграл");
                        }

                    }
                }

        }
    }
}
