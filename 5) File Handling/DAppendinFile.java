import java.io.FileWriter;
import java.io.IOException;
public class DAppendinFile {
     public static void main(String[] args) {
        try{
            //true = append mode -> without this it will overwrite the text of that file
            FileWriter obj = new FileWriter("firstfile.txt",true);
            obj.write("\nI adding more magic to my file");
            obj.close(); 
            System.out.println("Succesfully wrote to the file");
        }catch(IOException e){
            System.out.println("An error ocurred..");
            e.printStackTrace();
        }
    }
}
