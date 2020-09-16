package rubbish;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class ReadFile {
    public static void main(String[] args) throws FileNotFoundException , IOException {
        BufferedReader bufferedReader=new BufferedReader(new FileReader("file1"));
        String str=bufferedReader.readLine();
        System.out.println(str);

    }
}
