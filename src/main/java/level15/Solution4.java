package level15;

public class Solution4 {
    public static void main(String[] args) {
    print((double) 1);
    print((Object) 1);
    print((Integer) 1);
    }
    public static void print(Integer in){
        System.out.println("Это integer");
    }
    public static void print(Object o){
        System.out.println("object");
    }
    public static void print(double d){
        System.out.println("double");
    }
}
