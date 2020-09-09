package level14;

public class Solution {
    public static void main(String[] args) {
        RussianHen russianHen = new RussianHen();
        System.out.println(russianHen.getDescription());
        BelarusianHen belarusianHen = new BelarusianHen();
        System.out.println(belarusianHen.getDescription());
        UcrainianHen ucrainianHen = new UcrainianHen();
        System.out.println(ucrainianHen.getDescription());
    }

    static abstract class Hen {
        abstract int getCountOfEggsPerMonth();

        String getDescription() {
            return "Я-курица";
        }
    }

    static class RussianHen extends Hen {
        @Override
        int getCountOfEggsPerMonth() {
            return 100;
        }

        @Override
        String getDescription() {
            return "Моя страна Россия. Я несу " + getCountOfEggsPerMonth() + " яиц в месяц";
        }
    }

    static class UcrainianHen extends Hen {
        @Override
        int getCountOfEggsPerMonth() {
            return 50;
        }

        @Override
        String getDescription() {
            return "Моя страна Украина. Я несу " + getCountOfEggsPerMonth() + " яиц в месяц";
        }
    }

    static class BelarusianHen extends Hen {
        @Override
        int getCountOfEggsPerMonth() {
            return 65;
        }

        @Override
        String getDescription() {
            return "Моя страна Белоруссия. Я несу " + getCountOfEggsPerMonth() + " яиц в месяц";
        }
    }
}
