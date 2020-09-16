package level17.lvl4;

import java.util.ArrayList;
import java.util.List;

public class Solution2 {
    public static void main(String[] args) {

    }
    public static class Garden{
        public static List<String> fruits=new ArrayList<String>();
        public static List<String> vegetables=new ArrayList<String>();
        public synchronized void addFruit(int index, String fruit){
            fruits.add(index,fruit);
        }
        public synchronized void addVegetable(int index,String vegetable){
            vegetables.add(index,vegetable);
        }
        public synchronized void removeFruit(int index){
            fruits.remove(index);
        }
        public synchronized void removeVegetable(int index){
            vegetables.remove(index);
        }


    }
}
