package level12;

public class Solution {
    public static void main(String[] args) {
        System.out.println(getObjName(new Cat()));
        System.out.println(getObjName(new Tiger()));
        System.out.println(getObjName(new Lion()));
        System.out.println(getObjName(new Bull()));
        System.out.println(getObjName(new Pig()));

    }
    public static class Pet{

    }
    public static class Cat{
    }
    public static class Tiger{

    }
    public static class Lion{

    }
    public static class Bull{

    }
    public static class Pig{

    }
    public static String getObjName(Object obj){
        if( obj instanceof Cat){
            return "Cat";
        }
        else if(obj instanceof Tiger){
            return "Tiger";
        }
        else if(obj instanceof Lion){
            return "Lion";
        }
        else if(obj instanceof Bull){
            return "Bull";
        }
        else
            return "Pet";

    }
}
