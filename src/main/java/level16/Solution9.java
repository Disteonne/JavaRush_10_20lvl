package level16;

public class Solution9 {
    public static int totalCount=200;
    public static int speech=1000000;
    public static void main(String[] args) throws InterruptedException {
    Politician politician=new Politician("Vova");
    politician.join();
    Politician politician1=new Politician("Igor");
    Politician politician2=new Politician("Kate");
    System.out.println(politician);
    System.out.println(politician1);
    System.out.println(politician2);

    }
    public static class Politician extends Thread{
        private volatile int utCount;

        public Politician(String name) {
            super(name);
            start();
        }

        @Override
        public void run() {
            while (utCount<totalCount*speech){
                utCount++;
            }
        }
        public int getSpeech(){
            return utCount/speech;
        }

        @Override
        public String toString() {
            return "Речь сказал: "+getName()+" кол-во раз: "+utCount;
        }
    }
}
