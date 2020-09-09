package level14.ex4;

public class Solution {
    public static void main(String[] args) {
        Object object = new Drawable();
        printMainInfo(object);
        Object object1=new Movable();
        printMainInfo(object1);
    }

    static void printMainInfo(Object ob) {
        if (ob instanceof Drawable) {
            Drawable drawable = (Drawable) ob;
            drawable.draw();

        } else if (ob instanceof Movable) {
            Movable movable = (Movable) ob;
            movable.move();
        }
    }

    static class Drawable {
        void draw() {
            System.out.println("Я рисую");
        }
    }

    static class Movable {
        void move() {
            System.out.println("А я не рисую.хы");
        }
    }
}
