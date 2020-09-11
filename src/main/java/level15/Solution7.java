package level15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution7 {
    public static void main(String[] args) {
        try(BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in))) {
            int n=Integer.parseInt(bufferedReader.readLine());
            System.out.println(factorial(n));


        }catch (IOException ex){
            ex.getStackTrace();
        }
    }
    public static String factorial(int n){
        if(n==0 || n==1){
            return ""+1;
        }
        else {
            return ""+n*Integer.parseInt(factorial(n-1));
        }
    }
}
