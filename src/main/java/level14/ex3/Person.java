package level14.ex3;

public interface Person {
    class User implements Person{
        void live(){
            System.out.println("Я жив");
        }
    }
    class Loser implements Person{
        void doNothing(){
            System.out.println("Я ничего не делаю");
        }
    }
    class Proger implements Person{
        void enjoy(){
            System.out.println("Наслаждаюсь адом в поиске ошибок))");
        }

    }
    class Coder implements Person{
        void writeCode(){
            System.out.println("Пишу код");
        }
    }
}
