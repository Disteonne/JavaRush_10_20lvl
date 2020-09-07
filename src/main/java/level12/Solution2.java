package level12;

public class Solution2 {
    public static void main(String[] args) {

    }
    public interface CanFly{
        void fly();
    }
    public interface CanClimb{
        void run();
    }

    private class Cat implements CanClimb{
        @Override
        public void run() {
           System.out.println("Я умею носиться по дому");
        }
    }
    private class Dog implements CanClimb{
        @Override
        public void run(){
            System.out.println("Я тож умею бегать");
        }
    }
    private class Duck implements CanClimb,CanFly{
        @Override
        public void run() {
            System.out.println("Я тож не уткой деланны и умею бегать!");
        }
        @Override
        public void fly() {
            System.out.println("А еще я умею летать");
        }
    }
    private class Tiger implements   CanClimb{
        @Override

        public void run() {
            System.out.println("А я умею бегать быстрее,чем вы");
        }
    }
}
