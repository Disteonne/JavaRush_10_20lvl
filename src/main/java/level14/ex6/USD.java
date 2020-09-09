package level14.ex6;

public class USD extends  Money{
    public USD(double amount) {
        super(amount);
    }

    public  String getCurrencyName(){
        return "USD";
    }
}
