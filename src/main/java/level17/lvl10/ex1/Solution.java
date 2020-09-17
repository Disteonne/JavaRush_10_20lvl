package level17.lvl10.ex1;

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

    public static class Person extends Thread {
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
            DateFormat formatter = new SimpleDateFormat("dd-MMMM-yyy", Locale.ENGLISH);
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

            if (str[0].equals("-c")) {
                DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyy", Locale.ENGLISH);
                Date date = dateFormat.parse(str[3]);
                Person person = new Person(str[1], str[2], date);
                allPeople.add(person);
                System.out.println("id: " + (--Solution.id));
            }  if (str[0].equals("-d")) {
                //String str[] = addInfo.split(" ");
                removeListIndex(Integer.parseInt(str[1]));
            }  if (str[0].equals("-u")) {
                //String str[] = addInfo.split(" ");
                LinkedList<Person> linkedList=new LinkedList<Person>();
                linkedList.addAll(allPeople);
                DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyy", Locale.ENGLISH);
                Date date = dateFormat.parse(str[4]);
                int idPeople = Integer.parseInt(str[1]);
                for (Map.Entry<Integer,String> pair: listId.entrySet()
                     ) {
                    if(pair.getKey()==idPeople){
                        listId.remove(idPeople);
                        DateFormat formatter = new SimpleDateFormat("dd-MMMM-yyy", Locale.ENGLISH);
                        listId.put(idPeople,str[2]+" "+str[3]+" "+formatter.format(date));
                    }
                }
                linkedList.set(idPeople,new Person(str[2], str[3], date));
                allPeople.clear();
                allPeople.addAll(linkedList);
                //allPeople.add(idPeople, new Person(str[2], str[3], date));
            } if (str[0].equals("-i")) {
                //String str[] = addInfo.split(" ");
                printInfo(Integer.parseInt(str[1]));

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
                            allPeople.get(i).dateBirth = null;
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
