package level16.control;

public class Solution {
    public static void main(String[] args) {
        ImageReaderFactory imageReaderFactory = new ImageReaderFactory();
        try {
            imageReaderFactory.getImageReader(ImageTypes.JPG);
        }catch (IllegalAccessException ex){
            System.out.println("error");
        }
    }
}
