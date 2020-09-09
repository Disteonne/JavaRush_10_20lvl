package level14.ex4;

public class Solution1 {
    public static void main(String[] args) {
    Object ob=new Circle();
    printMainInfo(ob);
    Object obj=new Rectangle();
    printMainInfo(obj);
    }
    static void printMainInfo(Object ob) {
        if (ob instanceof Drawable) {
            Drawable drawable = (Drawable) ob;
            drawable.draw();

        } else if (ob instanceof MovableM) {
            MovableM movable = (MovableM) ob;
            movable.moveM();
        }
    }
    interface MovableM{
         void moveM();
    }
    static class Circle implements MovableM{
        public void moveM() {
            System.out.println("move");
        }
        public void draw(){
            System.out.println("draw");
        }
    }
    interface Drawable{
        void draw();
    }
    static class Rectangle implements Drawable{
        public void draw() {
            System.out.println("draww");
        }
        void moveM(){
            System.out.println("mooove");
        }
    }
}
