package level13;

public class lect2_3 {
    public static void main(String[] args) {

    }
    public interface SimpleObj<T>{
        SimpleObj<T> getInstance();
    }
    class Str implements SimpleObj<String>{
        public SimpleObj<String> getInstance(){
            return null;
        }
    }
}
