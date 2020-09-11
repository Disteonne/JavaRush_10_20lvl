package level15.ex3;

public class Sun implements  Planet {
    private static Sun sun;
    private Sun(){

    }
    public static Sun getInstance(){
        if(sun==null){
            sun=new Sun();
        }
        return sun;
    }
}
