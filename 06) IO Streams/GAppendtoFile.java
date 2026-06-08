import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class GAppendtoFile {
  public static void main(String[] args) {
    // true = append mode
    try (BufferedWriter bw = new BufferedWriter(new FileWriter("bufferfile.txt", true))) {
      bw.newLine();                      // move to a new line
      bw.write("Appended line");         // add new text at the end
      System.out.println("Successfully appended to the file.");
    } catch (IOException e) {
      System.out.println("Error writing file.");
    }
  }
}