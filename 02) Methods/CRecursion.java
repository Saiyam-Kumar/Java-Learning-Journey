public class CRecursion {


    //To print 1-10 numbers using recursion
    public static int sum(int num){
        if(num>0){
            return num+sum(num-1);
        }else{
            return 0;
        }
    }

    //To print the Factorial
    public static int fac(int n){
        if(n>1){
            return n*fac(n-1);
        }else{
            return 1;
        }
    }
    public static void main(String[] args) {
        //When fucn calls itself->Always Write Halting Condition without this we are gone into infinite Recursion

        System.out.println("Sum of numbers from 1-10 : "+sum(10));
        System.out.println("Factorial of number 5 : "+fac(5));
    }
    
}
