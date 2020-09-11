package level15.ex1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    private static CanFly result;
    static {
        Solution.reset();
    }
    public static void reset(){
        try {
            BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));
            String line= bufferedReader.readLine();
            if(line.equals("helicopter")){
                result=new Helicopter();
            }
            else if(line.equals("plane")){
                int number=Integer.parseInt(bufferedReader.readLine());
                result=new Plane(number);
            }
            bufferedReader.close();
        }catch (IOException ex){
            ex.getStackTrace();
        }
    }

    public static void main(String[] args) {

    }
}
