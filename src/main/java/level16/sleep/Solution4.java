package level16.sleep;

public class Solution4 {
    public static volatile Runway RUNWAY =new Runway();
    public static void main(String[] args) {
    Plane plane=new Plane("Plane 1");
    plane.start();
    Plane plane1=new Plane("Plane 2");
    plane1.start();
    Plane plane2=new Plane("Plane 3");
    plane2.start();
    }
    public static class Plane extends Thread{
        Plane(String name){
            super(name);
        }

        @Override
        public void run() {
            boolean isAlreadyTakOff=false;
            while (!isAlreadyTakOff){
                if(RUNWAY.trySetTakingOffPlane(this)){ //если полоса свободна
                    System.out.println(getName()+" взлетает");
                    takingOff(); //взлетаем
                    System.out.println(getName()+" уже в небе");
                    isAlreadyTakOff=true;
                    RUNWAY.setTakingOffPlane(null);
                }
                else if(!this.equals(RUNWAY.getTakingOffPlane())){
                    System.out.println(getName()+" ожидает");
                    waiting();
                }
            }
        }
    }
    public static void takingOff(){
        try {
            Thread.sleep(100);
        }catch (InterruptedException ex){
            ex.getStackTrace();
        }
    }
    public static void waiting(){
        try {
            Thread.sleep(100);
        }catch (InterruptedException ex){
            ex.getStackTrace();
        }
    }
    public static class Runway{
        private Thread t;
        public Thread getTakingOffPlane(){
            return  t;
        }
        public void setTakingOffPlane(Thread t){
            synchronized (this){
                this.t=t;
            }
        }
        public boolean trySetTakingOffPlane(Thread t){
            synchronized (this){
                if(this.t==null){
                    this.t=t;
                    return true;
                }
                return false;
            }
        }
    }
}
