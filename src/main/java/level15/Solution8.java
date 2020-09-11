package level15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution8 {
    public static void main(String[] args) {
        try {
            BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));
            int n=0;

            while (true){
                String str= bufferedReader.readLine();
                if(str.equals("exit")){
                    break;
                }
                try {
                if (str.contains(".")) {
                        double d = Double.parseDouble(str);
                        if (d > 0 && d < 128) {
                            System.out.println(d);

                        }
                        continue;
                    }
                }catch (Exception e){

                }
                try {
                if (Integer.parseInt(str) > 0 && Integer.parseInt(str) < 128) {
                        short s = Short.parseShort(str);
                        System.out.println(s);
                        continue;
                    }
                }catch (Exception e){

                }
                try {
                if(Integer.parseInt(str) < 0 && Integer.parseInt(str) > 128) {
                    System.out.println(Integer.parseInt(str));
                    continue;
                }
                }catch (Exception e) {

                }

            }
        }catch (IOException e){
            e.getStackTrace();
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }
}
