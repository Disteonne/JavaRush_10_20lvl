package level14.ex3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) {
        try {
            BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));
            String str=null;
            while (true){
                str= bufferedReader.readLine();
                    if(str.equals("user")){
                        Person.User user=new Person.User();
                        user.live();
                    }
                    else if(str.equals("loser")){
                        Person.Loser loser=new Person.Loser();
                        loser.doNothing();
                    }
                    else if(str.equals("coder")){
                        Person.Coder coder=new Person.Coder();
                        coder.writeCode();
                    }
                    else  if(str.equals("proger")){
                        Person.Proger proger=new Person.Proger();
                        proger.enjoy();
                    }
                    else
                        break;
            }
        }catch (IOException ex){
            ex.getStackTrace();
        }
    }
}
