import java.io.File; //File class
import java.io.IOException; //To handle errors
public class BCreateFile {
    public static void main(String args[]){
        try {
            File myobj = new File("firstfile.txt");
            if(myobj.createNewFile()){
                System.out.println("File created: " + myobj.getName());//returns file name
            }else{
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace(); // Print error details
        }
    }  
}
