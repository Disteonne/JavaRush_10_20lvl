package level17.lvl10.ex2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Solution {
    private static  int id;
    private static volatile Map<Integer, String> listId = new HashMap<Integer, String>();
    public static List<Person> allPeople = new ArrayList<Person>();

    static {
        allPeople.add(Person.createMale("Иванов Ива", new Date()));
        allPeople.add(Person.createMale("Петров Петр", new Date()));
    }

    public static void main(String[] args) {
        int i=0;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        try {
            while (i<5) {
                Person.addActions(bufferedReader.readLine());
                i++;
            }
        } catch (IOException e) {

        } catch (ParseException e) {
            System.out.println("lol");
        }
    }

    public static class Person {
        private String name;
        //private int ind ;
        private String sex;
        String info;
        Date dateBirth;
        private String newDate;

        Person(String name, String sex, Date dateBirth) {
            this.name = name;
            this.dateBirth = dateBirth;
            this.sex = sex;
            DateFormat formatter = new SimpleDateFormat("dd-MMM-yyy", Locale.ENGLISH);
            this.newDate = formatter.format(dateBirth);
            listId.put(id, this.name + " " + sex + " " + newDate);
            info = this.name + " " + sex + " " + newDate;
            Solution.id++;
        }

        Person(String name, Date dateBirth) {
            this.name = name;
            this.dateBirth = dateBirth;
            DateFormat formatter = new SimpleDateFormat("dd-MMMM-yyy", Locale.ENGLISH);
            this.newDate = formatter.format(dateBirth);
            listId.put(id, this.name + " " + sex + " " + newDate);
            info = this.name + " " + sex + " " + newDate;
            Solution.id++;
        }


        @Override
        public String toString() {
            return name + " " + sex + " " + newDate;
        }

        public static Person createMale(String name, Date date) {
            Person person = new Person(name, date);
            return person;
        }

        public static void addActions(String addInfo) throws ParseException {
            String str[] = addInfo.split(" ");
            /*
            ArrayList<String> list1=new ArrayList<String>();
            for (int i = 0; i < str.length; i++) {
                list1.add(str[i]);
            }

             */

            //String str1[]=new String[3];

            if (str[0].equals("-c")) {
                int count= (str.length-1)/3;
                int k=0;
                ArrayList<String> list2=new ArrayList<String>();
                list2.addAll(Arrays.asList(str));
                while (k<count) {

                    DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyy", Locale.ENGLISH);
                    Date date = dateFormat.parse(list2.get(3+3*k));
                    Person person = new Person(list2.get(1+3*k), list2.get(2+3*k), date);
                    allPeople.add(person);
                    person=null;
                    int index=Solution.id-1;
                    System.out.println("id: " +index);
                    /*
                    list2.remove(1+3*k);
                    list2.remove(2+3*k);
                    list2.remove(3+3*k);

                     */
                    k++;
                }
            }  if (str[0].equals("-d")) {
                int count=(str.length-1);
                int k=0;
                ArrayList<String> list2=new ArrayList<String>();
                for (int i = 0; i < str.length; i++) {
                    list2.add(str[i]);
                }
                //String str[] = addInfo.split(" ");
                while (k<count) {
                    removeListIndex(Integer.parseInt(list2.get(1+k)));
                   // list2.remove(1);
                    k++;
                }
            }  if (str[0].equals("-u")) {  //ConcurrentModificationException
                int count= (str.length-1)/4;
                int k=0;
                ArrayList<String> list2=new ArrayList<String>();
                for (int i = 0; i < str.length; i++) {
                    list2.add(str[i]);
                }
                //String str1[] = addInfo.split(" ");
                while (k<count) {
                    LinkedList<Person> linkedList = new LinkedList<Person>();
                    linkedList.addAll(allPeople);
                    DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyy", Locale.ENGLISH);
                    Date date = dateFormat.parse(list2.get(4+4*k));
                    int idPeople = Integer.parseInt(list2.get(1+4*k));
                    try {
                        for (Map.Entry<Integer, String> pair : listId.entrySet()
                        ) {
                            if (pair.getKey() == idPeople) {
                                listId.remove(idPeople);
                                DateFormat formatter = new SimpleDateFormat("dd-MMMM-yyy", Locale.ENGLISH);
                                listId.put(idPeople, list2.get(2 + 4 * k) + " " + list2.get(3 + 4 * k) + " " + formatter.format(date));
                            }
                        }
                    }catch (ConcurrentModificationException e){

                    }
                    linkedList.set(idPeople, new Person(list2.get(2+4*k), list2.get(3+4*k), date));
                    allPeople.clear();
                    allPeople.addAll(linkedList);
                    k++;
                }
                //allPeople.add(idPeople, new Person(str[2], str[3], date));
            } if (str[0].equals("-i")) {
                ArrayList<String> list2=new ArrayList<String>();
                for (int i = 0; i < str.length; i++) {
                    list2.add(str[i]);
                }
                int count= (str.length-1);
                int k=0;
                        while (k<count) {
                            printInfo(Integer.parseInt(list2.get(1)));
                            k++;
                            list2.remove(1);
                        }

            }
        }

        public static void removeListIndex(int id) {
            String getInfo = null;
            for (Map.Entry<Integer, String> pair : listId.entrySet()
            ) {
                if (pair.getKey() == id) {
                    getInfo = pair.getValue();
                    for (int i = 0; i < allPeople.size(); i++) {
                        if (allPeople.get(i).info.equals(getInfo)) {
                            allPeople.get(i).sex = null;
                            allPeople.get(i).newDate = null;
                            allPeople.get(i).name = null;
                            //allPeople.get(i).ind = 0;
                        }
                    }
                }
            }
        }

        public static void printInfo(int id) {
            String str = null;
            for (Map.Entry<Integer, String> pair : listId.entrySet()
            ) {
                if (pair.getKey() == id) {
                    str = pair.getValue();
                }
            }
            for (int i = 0; i < allPeople.size(); i++) {
                if (allPeople.get(i).info.equals(str)) {
                    System.out.println(allPeople.get(i));
                }
            }
        }
    }
}
