package level15.ex3;

public class LazyInitSingleton {
private static LazyInitSingleton instance;

    private LazyInitSingleton() {
    }
    public static LazyInitSingleton getInstance(){
        if (instance==null){
            instance=new LazyInitSingleton();
        }
        return instance;
    }
}
