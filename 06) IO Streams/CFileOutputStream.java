
import java.io.FileOutputStream;
import java.io.IOException;

public class CFileOutputStream {
    public static void main(String args[]){
        String text = "I am writing in the file";
        try(FileOutputStream output = new FileOutputStream("writefile.txt")){
            output.write(text.getBytes());//convert the string text into bytes
            System.out.println("Sucessfully written in file");
        }catch(IOException e){
            System.out.println("Error Occurred");
            e.getStackTrace();
        }
    } 
}
