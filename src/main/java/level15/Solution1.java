package level15;

public class Solution1 {
    public static void main(String[] args) {
    Solution1.Audi audi=new Audi();
    System.out.println(audi.println());
    }

    public static class Lux {
        String println() {
            return CheapCar.WANT_STRING+CheapCar.LUX_CAR;
        }
    }

    public static class Cheap {
        String println() {
            return CheapCar.WANT_STRING+CheapCar.CHEAP_CAR;
        }
    }

    public static class Ferrari extends Lux {
        @Override
        String println() {
            return super.println()+ CheapCar.FERRARI_CAR;
            }
    }

    public static class Audi extends Cheap {
        @Override
        String println() {
            return super.println()+CheapCar.AUDI;
        }
    }

    public static class CheapCar {
        public static String WANT_STRING = "Я хочу ездить на ";
        public static String LUX_CAR = " роскошкой машине ";
        public static String CHEAP_CAR = " дешевой машине ";
        public static String FERRARI_CAR = " феррари";
        public static String AUDI = " ауди";

    }
}
