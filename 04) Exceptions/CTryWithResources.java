//Using try with resources automatically close the resource without any manual close() -> safe,cleaner and shorter code
//Closing the resource is improtant because without that it will keep using memory and even prevent you from opening the file again until the program ends

import java.io.FileOutputStream;
import java.io.IOException;

public class CTryWithResources {
    public static void main(String[] args) {
        try(FileOutputStream output = new FileOutputStream("filename.txt")){
            output.write("Hello".getBytes());
            //no need to call close -> because we use declare resource inside parenthesis try(...)
            System.out.println("Successfully wrote to this file");
        }catch(IOException e){
            System.out.println("Error writing file");
        }
    }
}
