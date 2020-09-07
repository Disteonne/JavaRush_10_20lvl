package level13;

public class lect2 {
    public static void main(String[] args) {

    }
    public interface Drinker{
        void askForMore(String message);
        void sayThx();
        boolean isReadyToGoHome();
    }
    public interface Alcoholic extends Drinker{
        boolean READY_TO_GO_HOME=false;
        void sleepOnTheFloor();
    }
    public static class BeerLover implements Alcoholic{
        @Override
        public void askForMore(String message) {

        }
        @Override
        public void sayThx() {

        }
        @Override
        public boolean isReadyToGoHome() {
            return READY_TO_GO_HOME;
        }
        @Override
        public void sleepOnTheFloor() {

        }
    }
}
