package level13;

public class lect11_4 {
    public static void main(String[] args) {
    StrObject<String> strObject=new StrObject<String>();
    }
    interface SimpleObject<T>{
        SimpleObject<T> getInstance();
    }
   static class StrObject<T> implements SimpleObject<T>{
        @Override
       public SimpleObject<T> getInstance() {
           return null;
       }
   }
}
