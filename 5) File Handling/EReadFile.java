/*
Scanner - best for simple text and when you want to parse numbers or words easily.
BufferedReader - best for large text files, because it is faster and reads line by line.
FileInputStream - best for binary data (images, audio, PDFs) or when you need full control of raw bytes.
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class EReadFile {
    public static void main(String[] args) {
        try {
            File obj = new File("firstfile.txt");
            Scanner sc = new Scanner(obj);

            while(sc.hasNextLine()){
                String data = sc.nextLine();
                System.out.println(data);
            }
            sc.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred..");
            e.printStackTrace();
        }
    }
}