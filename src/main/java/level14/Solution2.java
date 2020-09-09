package level14;

import java.util.ArrayList;
import java.util.List;

public class Solution2 {
    public static void main(String[] args) {
    List<Apartaments> list=new ArrayList<Apartaments>();
    list.add(new OneRoom());
    list.add(new TwoRoom());
    list.add(new ThreeRoom());
    cleanRoom(list);
    }
    public static void cleanRoom(List<Apartaments> apartaments){
        for (int i = 0; i < apartaments.size(); i++) {
            if(apartaments.get(i) instanceof OneRoom){
                OneRoom oneRoom=(OneRoom) apartaments.get(i);
                oneRoom.clean1Room();
            }
            else if(apartaments.get(i) instanceof TwoRoom){
                TwoRoom twoRoom=(TwoRoom) apartaments.get(i);
                twoRoom.clean2Room();
            }
            else if(apartaments.get(i) instanceof ThreeRoom){
                ThreeRoom threeRoom=(ThreeRoom) apartaments.get(i);
                threeRoom.clean3Room();
            }
        }
    }
    static interface Apartaments{

    }
    static class OneRoom implements Apartaments{
        void clean1Room(){
            System.out.println("уборка 1 комн кв");
        }
    }
    static class TwoRoom implements Apartaments{
        void clean2Room(){
            System.out.println("уборка 2 комн кв");
        }
    }
    static class ThreeRoom implements Apartaments{
        void clean3Room(){
            System.out.println("уборка 3 комн кв");
        }
    }
}
