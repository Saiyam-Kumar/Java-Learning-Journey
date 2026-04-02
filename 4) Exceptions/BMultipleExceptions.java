//Sometimes more than one error occured in try block -> so we can use multiple catch blocks to handle that
//Always put general exceptions at last and specific exceptions at first

public class BMultipleExceptions {
    public static void main(String args[]){
        try{
            int[] numbers = {1,2,3,4,5};
            System.out.println(numbers[10]);
            int result = 10/0;

        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Array index does not exist");
        }
        catch(ArithmeticException e){
            System.out.println("Divide with zero error occured");
        }

        //Multiple Exceptions in one catch block
        try {
            int ans = 10/0;
            int[] num = {24,25,26,27};
            System.out.println(num[8]);
        } catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
            System.out.println("Math error or array error occured");
        }
    }
}
