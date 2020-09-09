package level14;

import javax.security.auth.login.FailedLoginException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Solution3 {
    public static List<Exception> list=new ArrayList<Exception>();
    public static void main(String[] args) {
        initExceptions();
        list.add(new FailedLoginException());
        list.add(new IOException());
        list.add(new ArrayIndexOutOfBoundsException());
        list.add(new ArithmeticException());
        //и тд
        for (Exception ex:list
             ) {
            System.out.println(ex);

        }

    }
    private static void initExceptions(){

    }
}
