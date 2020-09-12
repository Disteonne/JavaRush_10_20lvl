package level16;

import java.util.ArrayList;
import java.util.List;

public class Solution5  {
    public static void main(String[] args) throws InterruptedException {
    ListThread listThread=new ListThread("oneThread");
    ListThread listThread1=new ListThread("twoThread");
    listThread.start();
    listThread.join();
    listThread1.start();
    }
    public static void printList(List<String> list, String thread){
        for (String element:list
             ) {
            System.out.println(thread+" : "+element);
        }
    }
    public static List<String> getList (int n){
        List<String> res=new ArrayList<String>();
        for (int i = 0; i < n; i++) {
            res.add(""+(i+1));
        }
        return res;
    }
    public static class ListThread extends  Thread{
        public ListThread(String name) {
            super(name);
        }

        @Override
        public void run() {
            printList(getList(20),getName());
        }
    }
}
