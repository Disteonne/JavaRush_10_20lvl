package level16.control;

public class ImageReaderFactory {
    public static ImageReader getImageReader(ImageTypes type) throws  IllegalAccessException{
        if(type==null){
            throw new IllegalAccessException("Неизвесный тип картинки");
        }
         if(type.equals(ImageTypes.BMP)){
            System.out.println("BMP");
             return new BmpReader();
        }
         if(type.equals(ImageTypes.JPG)){
            System.out.println("JPG");
             return new JpgReader();
        }
        if(type.equals(ImageTypes.PNG)){
            System.out.println("PNG");
            return new PngReader();
        }
        else
            throw new IllegalAccessException("Неизвесный тип картинки");
    }
}
