package level13;

public class lect3_2 {
    public static void main(String[] args) {

    }
    interface Movable{
        void move();
    }
    interface Eat{
        void eat();
    }
    interface Edible{
        void beEaten();
    }
    class Cat implements Movable,Eat,Edible{

        public void move() {

        }

        public void eat() {

        }

        public void beEaten() {

        }
    }
    class Mouse implements Eat,Edible,Movable{

        public void move() {

        }

        public void eat() {

        }

        public void beEaten() {

        }
    }
    class Dog implements Eat,Movable{

        public void move() {

        }

        public void eat() {

        }
    }
}
