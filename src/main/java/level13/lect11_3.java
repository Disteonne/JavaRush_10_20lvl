package level13;

public class lect11_3 {
    public static void main(String[] args) {
    System.out.println(Matrix.NEO);
    }
    interface DBObject{
        DBObject init(int id,String name);
    }
    static class Matrix{
        public static DBObject NEO= new User().init(1,"Teo");
    }
    static class User implements DBObject{
        int id;
        String name;
        @Override
        public User init(int id, String name) {
            this.id=id;
            this.name=name;
            return this;
        }

        @Override
        public String toString() {
            return "The user`s name is "+name+",id="+id;
        }
    }
}
