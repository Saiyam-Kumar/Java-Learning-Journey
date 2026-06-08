import java.io.FileOutputStream;
import java.io.IOException;

public class DAppendtoFile{
    public static void main(String[] args) {
        String text = "Now i am adding the text in my write file";

        //true -> append mode
        try(FileOutputStream output = new FileOutputStream("writefile.txt",true)){
            output.write(text.getBytes());
            System.out.println("Successfully append the text");
        }catch(IOException e){
            System.out.println("Error Occured");
            e.printStackTrace();
        }
    }
}