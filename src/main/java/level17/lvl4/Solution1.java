package level17.lvl4;

import java.util.ArrayList;
import java.util.List;

public class Solution1 {
    public static void main(String[] args) {

    }
    public static class Note{
        public static final List<String> listThread=new ArrayList<String>();
        public static void addNote(int index,String note){
            System.out.println("Заметка "+note);
            synchronized (listThread){
                listThread.add(index,note);
            }
            System.out.println("заметка "+note+" добавлена");
        }
        public static void removeNote(int index){
            System.out.println("Удаление заметки...");
            String str;
            synchronized (listThread){
               str=listThread.remove(index);
            }
            System.out.println("Заметка "+str+" удалена!");
        }
    }
}
