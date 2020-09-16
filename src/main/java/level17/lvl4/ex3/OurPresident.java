package level17.lvl4.ex3;

public class OurPresident {
    private static OurPresident ourPresident;
    private OurPresident(){
    }
    static {
        synchronized (OurPresident.class){
            ourPresident=new OurPresident();
        }
    }
    public static OurPresident getOurPresident(){
        return ourPresident;
    }
}
