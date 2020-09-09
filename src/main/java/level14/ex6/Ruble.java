package level14.ex6;

public class Ruble extends Money{
    public Ruble(double amount) {
        super(amount);
    }

    public String getCurrencyName(){
        return "RUB";
    }
}
