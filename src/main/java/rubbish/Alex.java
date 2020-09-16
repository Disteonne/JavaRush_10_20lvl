package rubbish;
import java.util.ArrayList;
import java.util.List;

public class Alex {
    public static void main(String[] args) throws InterruptedException {
        OnlineGame onlineGame = new OnlineGame();
        onlineGame.start();
    }

    public static class OnlineGame extends Thread {
        public static volatile boolean isWinnerFound = false;

        public static List<String> steps = new ArrayList<String>();

        static {
            steps.add("Начало игры");
            steps.add("Сбор ресурсов");
            steps.add("Рост экономики");
            steps.add("Убийство врагов");
        }

        protected Gamer gamer1 = new Gamer("Ivanov", 15);
        protected Gamer gamer2 = new Gamer("Petrov", 6);
        protected Gamer gamer3 = new Gamer("Sidorov", 21);

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

    public static class Gamer extends Thread {
        private int rating;

        public Gamer(String name, int rating) {
            super(name);
            this.rating = rating;
        }

        @Override
        public void run() {
            for (int i = 0; i < OnlineGame.steps.size() + 1; i++) {
                if (OnlineGame.isWinnerFound) {

                } else if (i == 4) {

                    System.out.println(getName() + ":победитель!");
                    OnlineGame.isWinnerFound = true;
                } else {
                    try {
                        Thread.sleep(1000 / rating);
                        System.out.println(getName() + ":" + OnlineGame.steps.get(i));
                    } catch (InterruptedException e) {
                        System.out.println(getName() + ":проиграл");

                    }

                }
            }
        }

    }
}