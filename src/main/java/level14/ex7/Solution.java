package level14.ex7;

public class Solution {
    public static void main(String[] args) {
    Singleton.getInstance();
    System.out.println(Singleton.getInstance().getClass().getSimpleName());
    }
}
