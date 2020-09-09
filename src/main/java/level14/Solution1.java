package level14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution1 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));
        String line;
        while (true){
            line= bufferedReader.readLine();
            if(line.equals("soapOpera")){
            Movie movie=MovieFactory.getMovie(line);
            System.out.println(movie.getClass().getSimpleName());
            }
            else if(line.equals("thriller")){
                Movie movie=MovieFactory.getMovie(line);
                System.out.println(movie.getClass().getSimpleName());
            }
            else if(line.equals("cartoon")){
                Movie movie=MovieFactory.getMovie(line);
                System.out.println(movie.getClass().getSimpleName());
            }
            else
                break;

        }

    }
    static class MovieFactory{
        static Movie getMovie(String key){
            Movie movie=null;
            if("soapOpera".equals(key)){
                movie=new SoapOpera();
            }
            else if("thriller".equals(key)){
                movie=new Thriller();
            }
            else if("cartoon".equals(key)){
                movie=new Cartoon();
            }
            return movie;
        }

    }
    static abstract class Movie{
    }
    static class SoapOpera extends Movie{
    }
    static class Cartoon extends Movie{
    }
    static class Thriller extends Movie{
    }
}
