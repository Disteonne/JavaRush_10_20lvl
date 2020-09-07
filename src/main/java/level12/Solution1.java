package level12;

public class Solution1 {
    public static void main(String[] args) {
        System.out.println(getClassName(new Cat()));
        System.out.println(getClassName(new Tiger()));
        System.out.println(getClassName(new Lion()));
        System.out.println(getClassName(new Cow()));
        System.out.println(getClassName(new Pig()));
    }
    public  static String getClassName(Object obj){
        if (obj instanceof Tiger){
            return "Tiger";
        }
        else if(obj instanceof Lion){
            return "Lion";
        }
        else if( obj instanceof Cat){
            return "Cat";
        }
        else if(obj instanceof Cow){
            return "Cow";
        }
        else
            return "Pet";
    }
    private static class Pet{

    }
    private static class Cat extends Pet{

    }
    private static class Lion extends Cat{

    }
    private static class Tiger extends Cat{

    }
    private static class Cow extends Pet{

    }
    private static class Pig extends Pet{

    }
}
