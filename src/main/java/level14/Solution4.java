package level14;

public class Solution4 {
    public static void main(String[] args) {
        Swimmable swimmable = new Orca();
        swimmable.swim();
        swimmable=new Otter();
        swimmable.swim();

    }

    public static void test(Swimmable swimmable) {
        swimmable.swim();
    }

    interface Walkable {
        void walk();
    }

    interface Swimmable {
        void swim();
    }

    static abstract class OceanAnimal {
        public void swim() {
            OceanAnimal currentAnimal = (OceanAnimal) getCurrentAnimal();
            currentAnimal.displaySwim();
        }

        private void displaySwim() {
            System.out.println(getCurrentAnimal().getClass().getSimpleName() + "is swimming");
        }

        abstract Swimmable getCurrentAnimal();
    }

    static class Orca extends OceanAnimal implements Swimmable{
        public void swim() {

        }

        @Override
        Swimmable getCurrentAnimal() {
            return null;
        }
    }

    static class Otter implements Swimmable, Walkable {
        public void swim() {

        }

        public void walk() {

        }
    }
}
