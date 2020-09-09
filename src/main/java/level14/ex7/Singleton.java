package level14.ex7;

public final class Singleton {
    private static Singleton singleton;
    static Singleton getInstance() {
        if(singleton==null){
            singleton=new Singleton();
        }
        return singleton;
    }

    private Singleton() {
    }
}
