package level17.lvl4.ex4;

public class IMF {
    private static IMF imf;

    private IMF() {
    }

    public static  IMF getImf() {
        synchronized (IMF.class) {
            if (imf == null) { //ПОЧЕМУ ТАК???
                imf=new IMF();
                return imf;
            } else
                return imf;
        }
    }
}
