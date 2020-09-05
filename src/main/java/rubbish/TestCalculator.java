package rubbish;

public class TestCalculator {
    public static void main(String[] args) {
        Calculator calculator=new Calculator();
        int res=calculator.sum(3,4);
        if(res!=7)
            System.out.println("error");
    }
}
