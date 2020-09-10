package level15;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Solution2 {
    public static void main(String[] args) {
        List<Book> list=new LinkedList<Book>();
        list.add(new Agata("Hercule"));
        list.add(new MarkTwainBook("Tom"));
        System.out.println(list);
    }
    public abstract static class Book{
        private String author;
        Book(String author){
            this.author=author;
        }
        public abstract Book getBook();
        public abstract String getTitle();

        private String getOutputByBookType(){
            String agathaChristieOutput=author +" : "+getBook().getTitle();
            String markTwain=author+" : "+getBook().getTitle();
            String number=null;
            String output="output";
            if(getBook() instanceof MarkTwainBook){
                number=markTwain;
            }
            else if( getBook() instanceof Agata ){
                number=agathaChristieOutput;
            }
            return number;
        }

        @Override
        public String toString() {
            return getOutputByBookType();
        }
    }

    public static class MarkTwainBook extends Book{
        private String title="Tom";
        MarkTwainBook(String title) {
            super("mark twain");
            this.title=title;
        }

        @Override
        public String getTitle() {
            return title;
        }

        @Override
        public Book getBook() {
            return this;
        }
    }
    public static class Agata extends  Book{
    private  String title="Hercule";

        Agata(String title) {
            super("Agata");
            this.title=title;
        }

        @Override
        public Book getBook() {
            return this;
        }

        @Override
        public String getTitle() {
            return title;
        }
    }
}
