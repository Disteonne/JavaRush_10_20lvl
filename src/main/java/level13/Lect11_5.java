package level13;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Lect11_5 {
    public static void main(String[] args) {
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            String name = bufferedReader.readLine();
            //открытие чтения файла
            BufferedReader bufferedReader1=new BufferedReader(new FileReader(name+".txt"));
            String line;
            ArrayList<Integer> list=new ArrayList<Integer>();
            while ((line=bufferedReader1.readLine())!=null){
                list.add(Integer.parseInt(line));
            }
            //сортировка
            Collections.sort(list);
            for (int i = 0; i < list.size(); i++) {
                if(list.get(i)%2==0)
                    System.out.println(list.get(i));
                else
                    continue;
            }
        }catch (IOException ex){
            ex.getStackTrace();
        }
    }
}
