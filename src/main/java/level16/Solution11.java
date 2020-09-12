package level16;

public class Solution11 {
    public static void main(String[] args) {
        Cat cat = new Cat("Мурка");
    }

    static class Cat extends Thread {
        protected Kitten kitten1;
        protected Kitten kitten2;

        Cat(String name) {
            super(name);
            kitten1 = new Kitten("Kitten 1,mother is " + getName());
            kitten2 = new Kitten("Kitten 2,mother is " + getName());
            start();
        }

        @Override
        public void run() {
            System.out.println(getName() + " родила 2х котят");
            try {
                initAllKitten();
            } catch (InterruptedException ex) {
                ex.getStackTrace();
            }
            System.out.println("все котята в корзине");
        }

        private void initAllKitten() throws InterruptedException {
            kitten1.start();
            kitten1.join();
            kitten2.start();
            kitten2.join();
        }
    }

    static class Kitten extends Thread {
        Kitten(String name) {
            super(name);
        }

        @Override
        public void run() {
            System.out.println(getName() + " вылез из корзины!");

            try {
                Thread.sleep(200);
            } catch (InterruptedException ex) {
                ex.getStackTrace();
            }

        }
    }
}
