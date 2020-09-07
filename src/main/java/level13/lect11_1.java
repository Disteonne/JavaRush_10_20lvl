package level13;

import java.io.*;

public class lect11_1 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader =new BufferedReader(new InputStreamReader(System.in));
        String nameFile= bufferedReader.readLine();

        InputStream inputStreamReader=new FileInputStream(nameFile);
        BufferedInputStream bufferedInputStream=new BufferedInputStream(inputStreamReader);
        while (bufferedInputStream.available()>0){
            char c= (char) bufferedInputStream.read();
            System.out.println(c);
            inputStreamReader.close();
            bufferedInputStream.close();
            bufferedReader.close();
        }
    }
}
