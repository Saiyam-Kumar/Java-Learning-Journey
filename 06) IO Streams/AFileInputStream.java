import java.io.FileInputStream;
import java.io.IOException;
public class AFileInputStream {
    public static void main(String args[]){
        try(FileInputStream input = new FileInputStream("myfile.txt")){
            int i; //variable to store each byte that is read
            while((i=input.read())!=-1){ //read one byte until the end of file
                System.out.print((char)i); //byte to char
            }
            System.out.println();
        }catch(IOException e){
            System.out.println("Error while reading a file");
        }
    }
}
