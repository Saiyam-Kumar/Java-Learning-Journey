import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
public class EPackagesInput{
//Used to group related classes
//1)Built-in Packages -> import java.util.*; (for all packages)
                //    -> import java.time -
               /*LocalDate 	Represents a date (year, month, day (yyyy-MM-dd))
                LocalTime 	Represents a time (hour, minute, second and nanoseconds (HH-mm-ss-ns))
                LocalDateTime 	Represents both a date and a time (yyyy-MM-dd-HH-mm-ss-ns)
                DateTimeFormatter 	Formatter for displaying and parsing date-time objects*/

//2)User defined Packages -> used in multiple classes

/*                                                    
nextBoolean() -> Reads a boolean value from the user
nextByte() -> Reads a byte value from the user
nextDouble() -> Reads a double value from the user
nextFloat() -> Reads a float value from the user
nextInt() -> Reads a int value from the user
nextLine() -> Reads a String value from the user
nextLong() -> Reads a long value from the user
nextShort() -> Reads a short value from the user
*/
             
    public static void main(String args[]){
        Scanner obj = new Scanner(System.in);

        System.out.print("Enter Username:");
        String userName = obj.nextLine();

        System.out.print("Enter Age:");
        int age = obj.nextInt();

        System.out.print("Enter Cgpa:");
        double cgpa = obj.nextDouble();

        System.out.println("Username is: " + userName);
        System.out.println("Age is: " + age);
        System.out.println("cgpa is: " + cgpa);


        // Get current date & time
        LocalDateTime currentDateTime = LocalDateTime.now();
        DateTimeFormatter formatObj =
                DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

        String formattedDateTime = currentDateTime.format(formatObj);

        // Display date & time
        System.out.println("\n--- System Info ---");
        System.out.println("Current Date & Time: " + formattedDateTime);

        obj.close();
    }
}
