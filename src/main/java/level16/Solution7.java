package level16;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Solution7 {
    public static void main(String[] args) {
        List<Cat> list=new ArrayList<Cat>();
        list.add(new Cat(3,"Vasya"));
        list.add(new Cat(15,"Alice"));
        list.add(new Cat(7,"Danya"));
        //Collections.sort(list);
        Cat.CompareCatName compareCatName=new Cat.CompareCatName();
        Collections.sort(list,compareCatName);
        for (Cat c: list
             ) {
            System.out.println(c);

        }
    }
    static class Cat {
        private int age;
        private String name;


        public Cat(int age, String name) {
            this.age = age;
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public String getName() {
            return name;
        }
    static class CompareCatName implements  Comparator<Cat>{
        public int compare(Cat o1, Cat o2) {
            return o1.age-o2.age;
        }
    }
        /*
        public int compareTo(Cat o) {
            //return getAge()-o.getAge();
            return name.compareTo(o.getName());
        }

         */

        @Override
        public String toString() {
            return name+ " : "+age;
        }
    }
}
