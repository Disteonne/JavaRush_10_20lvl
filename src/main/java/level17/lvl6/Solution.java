package level17.lvl6;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) {

    }
    public static class Note{
        public static volatile List<String> list=new ArrayList<String>(); //запрещаем кэш
        public synchronized void addNote(int index,String note){
            list.add(index,note);
        }
        public synchronized void removeNote(int index){
            list.remove(index);
        }
    }
}
