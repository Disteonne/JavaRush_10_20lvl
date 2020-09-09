package level14.ex2;

public class Solution {
    public static void main(String[] args) {
        Wine wine=new Wine();
        Wine wine1=new BubblyWine();
        System.out.println(wine.getHolDay());
        System.out.println(wine1.getHolDay());
        wine.taste();
    }
}
