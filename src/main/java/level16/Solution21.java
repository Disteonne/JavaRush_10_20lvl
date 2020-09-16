package level16;

import java.io.*;
import java.util.List;
import java.util.Scanner;

public class Solution21 {
    public static String firstFileName;
    public static String secondFileName;

    static {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        try {
            firstFileName = bufferedReader.readLine();
            secondFileName = bufferedReader.readLine();
        } catch (IOException e) {
            System.out.println("___");
        }
    }

    public static void main(String[] args) throws InterruptedException {
        ReadFileThread rf1 = new ReadFileThread();
        ReadFileThread rf2 = new ReadFileThread();
        rf1.setFileName(firstFileName);
        rf2.setFileName(secondFileName);
        rf1.start();
        rf1.join();
        System.out.println(rf1.getFileContent());
        rf2.start();
        rf2.join();
        System.out.println(rf2.getFileContent());

    }

    public static class ReadFileThread extends Thread implements ReadFileInterface {
        String fileName;
        String str = "";

        public void setFileName(String fileName) {
            this.fileName = fileName;
        }

        public String getFileContent() {
            return str;
        }

        @Override
        public void run() {
            try {
                //BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName));
                File file = new File(fileName);
                Scanner scanner = new Scanner(file);
                while (scanner.hasNextLine()) {
                    str = str + " " + scanner.nextLine();
                }
                scanner.close();
            } catch (FileNotFoundException e) {
                e.getStackTrace();
            }
        }
    }

    public static interface ReadFileInterface {
        public void setFileName(String fileName);

        public String getFileContent();
    }

}

