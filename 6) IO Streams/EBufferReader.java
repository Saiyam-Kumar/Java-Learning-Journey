//make reading and writing text files faster
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class EBufferReader {
    public static void main(String[] args) {
    try (BufferedReader br = new BufferedReader(new FileReader("bufferfile.txt"))) {
      String line;
      while ((line = br.readLine()) != null) {
        System.out.println(line);
      }
    } catch (IOException e) {
      System.out.println("Error reading file.");
    }
  }
       
}
