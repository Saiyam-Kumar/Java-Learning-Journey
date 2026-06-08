// Exception : Error thrown by java it can be compile time, runtime or logical.
// To handle exception we use try -> block of code to try
// catch -> block of code to handle errors.
public class AExceptions {
    // throws -> used in method declaration to tell that this method may generate an exception
    public static void checkAge(int age) throws ArithmeticException {
        if(age < 18){
            // throw -> used to manually create or generate an exception
            throw new ArithmeticException("Access denied");
        }
        else{
            System.out.println("Access Granted");
        }
    }
    public static void main(String[] args) {
        try{
            int[] numbers = {1,2,3};
            System.out.println(numbers[2]); // accessing array element
        }
        catch(Exception e){
            System.out.println("Something went wrong"); // executes if error occurs
        }
        finally{
            // finally -> always executes whether exception occurs or not
            System.out.println("This statement always execute regardless of result of try and catch");
        }

        int age = 16;
        // calling method that may throw an exception
        checkAge(age);
    } 
}