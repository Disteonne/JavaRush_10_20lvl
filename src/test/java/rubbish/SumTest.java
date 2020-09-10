package rubbish;

import org.junit.Test;

import static org.junit.Assert.*;

public class SumTest {
    @Test
    public void whenThan(){
        double res=new Sum().sum(2.3,6.0);
        double res1=8.3;
        assertEquals(res,res1,0.0001);
    }

}