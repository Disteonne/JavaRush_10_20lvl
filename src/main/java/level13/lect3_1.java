package level13;


public class lect3_1 {
    public static void main(String[] args) {
    EnglishTransl englishTransl=new EnglishTransl();
    System.out.println(englishTransl.getLanguage());
    System.out.println(englishTransl.translate());

    }
    public static abstract class Translator{
        public abstract String getLanguage();
        public String translate(){
            return  "я переводчик " +getLanguage();
        }
    }
    public static class EnglishTransl extends Translator{
        @Override
        public String getLanguage() {
            return "Английского";
        }
    }

}
