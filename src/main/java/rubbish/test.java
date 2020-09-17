package rubbish;

import java.util.ArrayList;
import java.util.List;

public class test {
    public static void main(String[] args) {

        ArrayList<Integer> list=new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }
        for (int i = 0; i < 5; i++) {
            list.remove(i);
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        System.out.println(list.size());
    }
}
