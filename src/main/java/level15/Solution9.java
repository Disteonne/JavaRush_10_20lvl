package level15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution9 {
    public static void main(String[] args) {
        int indexLeft;
        int indexRight;
        try {
            BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));
            String str= bufferedReader.readLine();
            char[] strToCharArray=str.toCharArray();
            indexLeft=getIndexSymbol1(strToCharArray);
            indexRight=getIndexSymbol2(strToCharArray);
            String str1="";
            for (int i = indexLeft+1; i <indexRight; i++) {
                //System.out.print(strToCharArray[i]);
                str1+=strToCharArray[i];
            }

            //System.out.println(str1);
            String[] strToArray=str1.split("=");
            /*
            for (int i = 0; i < strToArray.length; i++) {
                System.out.println(strToArray[i]);
            }
             */
            alert(Double.parseDouble(strToArray[1]));
            alert(strToArray[0]);

            bufferedReader.close();
        }catch (IOException e){
            e.getStackTrace();
        }
    }
    public static void alert(double value) {
        System.out.println("double: " + value);
    }

    public static void alert(String value) {
        System.out.println("String: " + value);
    }
    public static int getIndexSymbol1(char[] strToCharArray){
        int indexLeft = 0;
        for (int i = 0; i < strToCharArray.length; i++) {
            if (strToCharArray[i] == '?')
                indexLeft = i;
        }
        return indexLeft;
    }
    public  static int getIndexSymbol2(char[] strToCharArray){
        int indexRight=0;
        for (int i = 0; i < strToCharArray.length; i++) {
            if(strToCharArray[i]=='&')
                indexRight=i;
        }
        return indexRight;
    }
}
