package level13;

import java.io.*;

public class lect11_2 {
    public static void main(String[] args) {
        try {
            BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));
            String name= bufferedReader.readLine();
            BufferedWriter bufferedWriter=new BufferedWriter(new FileWriter(name+".txt"));
            String str=null;
            while (!(str=bufferedReader.readLine()).equals("exit")){
                bufferedWriter.write(str);
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
            bufferedReader.close();
        }catch (IOException ex){
            ex.getStackTrace();
        }
    }
}
