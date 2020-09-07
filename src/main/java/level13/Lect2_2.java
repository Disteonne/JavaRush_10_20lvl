package level13;

public class Lect2_2 {
    public static void main(String[] args) {
    print(new Cola());
    print(new Beer());
    }
    public static void print(DrinkK drink){
        System.out.println(drink.isAlcoholic());
    }
    public interface DrinkK{
        boolean isAlcoholic();
    }
    public static class Cola implements DrinkK{
        @Override
        public boolean isAlcoholic(){
            return false;
        }
    }
    public static class Beer implements DrinkK{
        @Override
        public boolean isAlcoholic(){
            return true;
        }
    }
}
