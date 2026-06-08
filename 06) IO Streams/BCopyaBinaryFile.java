import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BCopyaBinaryFile {
    public static void main(String[] args) {
        //copy image.jpg to copy.jpg
        try(FileInputStream input = new FileInputStream("image.jpg");
        FileOutputStream output = new FileOutputStream("copy.jpg")){

            int i;
            while((i=input.read())!=-1){
                output.write(i);//raw byte to a new file
            }
            System.out.println("File copied successfully.");
        }catch(IOException e){
            System.out.println("Error Ocurred");
        }
    }
}
