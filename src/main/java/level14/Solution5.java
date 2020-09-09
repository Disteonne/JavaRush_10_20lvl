package level14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution5 {
    public static void main(String[] args) {
        try {
            BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));
            int a=Integer.parseInt(bufferedReader.readLine());
            int b=Integer.parseInt(bufferedReader.readLine());
            ArrayList<Integer> divA=new ArrayList<Integer>();
            ArrayList<Integer> divB=new ArrayList<Integer>();
            divA=dividers(a);
            divB=dividers(b);
            int nod=0;
            for (int i = 0; i <divA.size() ; i++) {
                for (int j = 0; j < divB.size(); j++) {
                    if(divA.get(i)==divB.get(j)){
                        nod=divA.get(i);
                    }
                }
            }
            System.out.println(nod);
            /*                  TEST
            for (int i = 0; i < divA.size(); i++) {
                System.out.print(divA.get(i)+"\t" );
            }
            for (int i = 0; i < divB.size(); i++) {
                System.out.print(divB.get(i)+"\t");
            }

             */

        }catch (IOException ex){
            ex.getStackTrace();
        }
    }
    public static ArrayList<Integer> dividers(int numb){
        ArrayList<Integer> divider=new ArrayList<Integer>();
        for (int i =1; i <=numb; i++) {
                if(numb%i==0){
                    divider.add(i);
                }
        }
        return divider;
    }
}
