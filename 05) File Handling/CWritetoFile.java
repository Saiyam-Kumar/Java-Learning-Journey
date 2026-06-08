/*
FileWriter - easiest choice for basic text.
BufferedWriter - better for large text files, because it is faster and supports handy features.
FileOutputStream - best for binary data (images, audio, PDFs)
 */
import java.io.FileWriter;
import java.io.IOException;

public class CWritetoFile {
    public static void main(String[] args) {
        try{
            FileWriter obj = new FileWriter("firstfile.txt");
            obj.write("This is my first file created by java and now i am writing in this its really like magic !!!!");
            obj.close(); //must close manually -> can also make this automatic by using try with resources
            System.out.println("Succesfully wrote to the file");
        }catch(IOException e){
            System.out.println("An error ocurred..");
            e.printStackTrace();
        }
    }
}
