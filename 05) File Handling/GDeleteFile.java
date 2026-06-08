//Can also delete folder like this 
import java.io.File;
public class GDeleteFile {
    public static void main(String[] args) { 
    File myObj = new File("secondfile.txt"); 
    if (myObj.delete()) { 
      System.out.println("Deleted the file: " + myObj.getName());
    } else {
      System.out.println("Failed to delete the file.");
    } 
  } 
}
