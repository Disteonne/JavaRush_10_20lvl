package level14.ex6;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        Person person = new Person("Ivan");
        for (Money m : person.getList()
        ) {
            System.out.println(m.getAmount()+" "+m.getCurrencyName());
        }
    }

    static class Person {
        public String name;
        private List<Money> list;

        public Person(String name) {
            this.name = name;
            this.list = new ArrayList<Money>();
            list.add(new Hrivna(66));
            list.add(new Ruble(100));
            list.add(new USD(2));
        }

        public List<Money> getList() {
            return list;
        }
    }
}
