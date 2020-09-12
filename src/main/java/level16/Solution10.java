package level16;

public class Solution10  {
    public static void main(String[] args) throws InterruptedException {
    Mouse alpha =new Mouse("#1");
    alpha.join();
    Mouse mouse=new Mouse("#2");
    mouse.join();
    Mouse mouse1=new Mouse("#3");
    }
    public static void eat(){
        try {
            Thread.sleep(2000);
        }catch (InterruptedException ex){
            ex.getStackTrace();
        }
    }
    public static class Mouse extends Thread{
        Mouse(String name){
            super(name);
            start();
        }

        @Override
        public void run() {
            System.out.println(getName()+" is starting to eat");
            eat();
            System.out.println(getName()+" is finished to eat");
        }
    }
}
