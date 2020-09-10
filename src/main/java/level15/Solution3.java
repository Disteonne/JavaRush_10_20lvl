package level15;

import java.util.ArrayList;
import java.util.List;

public class Solution3 {
    public static void main(String[] args) {
    printlnBodyParts();
    printlnFingers();
    printlnLivParts();
    }
    public static interface LivingPart{
        Object containsBones();
    }
    public static class BodyPart implements LivingPart{
        private String name;
        BodyPart(String name){
            this.name=name;
        }
        public Object containsBones() {
            if (name.equals("Голова"))
                return "No";
            return "Yes";
        }

        @Override
        public String toString() {
            if( containsBones()=="Yes"){
                return name+" содержит кости";
            }
            else
                return name+" не содержит кости";
        }
    }
    public static class Finger extends BodyPart{
        private boolean isArtificial;
        Finger(String name,boolean isArtificial){
            super(name);
            this.isArtificial=isArtificial;
        }

        @Override
        public Object containsBones() {
            if (super.containsBones()=="Yes"&& !isArtificial){
                return "Yes";
            }
            else
                return "No";
        }
    }
    private static void printlnLivParts(){
        System.out.println(new BodyPart("Рука").containsBones());
    }
    private static void printlnBodyParts() {
        List<BodyPart> bodyParts = new ArrayList<BodyPart>(5);
        bodyParts.add(new BodyPart("Рука"));
        bodyParts.add(new BodyPart("Нога"));
        bodyParts.add(new BodyPart("Голова"));
        bodyParts.add(new BodyPart("Тело"));
        System.out.println(bodyParts.toString());
    }

    private static void printlnFingers() {
        List<Finger> fingers = new ArrayList<Finger>(5);
        fingers.add(new Finger("Большой", true));
        fingers.add(new Finger("Указательный", true));
        fingers.add(new Finger("Средний", true));
        fingers.add(new Finger("Безымянный", false));
        fingers.add(new Finger("Мизинец", true));
        System.out.println(fingers.toString());
    }
}
