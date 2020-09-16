package rubbish;

import level15.ex3.LazyInitSingleton;

public class SingleTone {
    private static SingleTone singleTone;
    private  SingleTone(){}
    public static SingleTone getST(){
        if(singleTone==null){
            return  new SingleTone();
        }
        else
            return singleTone;
    }
}
class Test{
    public static void main(String[] args) {
        SingleTone s1=SingleTone.getST();
        SingleTone s2=SingleTone.getST();
        System.out.println(s1==s2);
        LazyInitSingleton l1=LazyInitSingleton.getInstance();
        LazyInitSingleton l2=LazyInitSingleton.getInstance();
        System.out.println(l1==l2);
    }
}
 class LazyInitializedSingleton {
    private static LazyInitializedSingleton instance;
    private LazyInitializedSingleton(){}
    public static LazyInitializedSingleton getInstance(){ // #3
        if(instance == null){		//если объект еще не создан
            instance = new LazyInitializedSingleton();	//создать новый объект
        }
        return instance;		// вернуть ранее созданный объект
    }
}
