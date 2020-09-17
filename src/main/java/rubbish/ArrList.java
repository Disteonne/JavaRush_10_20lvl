package rubbish;

import java.util.ArrayList;
import java.util.List;

public class ArrList {
    public static void main(String[] args) {

        List<Integer> list=new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(1,4);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
