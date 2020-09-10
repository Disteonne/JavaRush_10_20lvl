package level15;

public class Solution {
    public static void main(String[] args) {
        Solution.Goose goose=new Goose();
        System.out.println(goose.getSize());
    }
    public static class Goose extends SmallAnimal{
        @Override
       public String getSize() {
            return "Гусь маленький,"+super.getSize();
        }
    }
    public static class Dragon extends BigAnimal{
        @Override
        public String getSize() {
            return "дракон большой,"+super.getSize();
        }
    }
    public static class BigAnimal{
        protected String getSize(){
            return "как динозавр";
        }
    }
    public static class SmallAnimal{
        String getSize(){
            return "как кошка";
        }
    }

}
