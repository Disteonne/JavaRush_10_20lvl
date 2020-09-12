package level16;

import java.util.*;

public class Solution8 {
    public static void main(String[] args) {
        Set<Cat> set=new HashSet<Cat>();
        List<Cat> list=new ArrayList<Cat>();
        list.add(new Cat("Alya",20));
        list.add(new Cat("Igor",13));
        list.add(new Cat("Ivan",2));
        list.add(new Cat("Igor",13));
        list.add(new Cat("Alice",3));
        set.addAll(list);
        for (Cat element:set
             ) {

            System.out.println(element);
        }

    }
    static class Cat{
        private String name;
        private int age;

        public Cat(String name, int age) {
            this.name = name;
            this.age = age;
        }

        @Override
        public boolean equals(Object o) {
            Cat cat=(Cat) o;
            if(name.equals(((Cat) o).name)&& age==((Cat) o).age){
                return  true;
            }
            else
                return false;
        }

        @Override
        public int hashCode() {
            return name.hashCode();
        }

        @Override
        public String toString() {
            return name+" "+age;
        }
    }

}
