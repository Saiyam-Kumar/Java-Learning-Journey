public class AMethods{
    static void myfunc(){
        System.out.println("Java is Fun !");
    }
    //Parameters are passed in fucn -> firstname and also add multiple paramters
    //Arguments are real values passed during fucn call -> Saiyam and Ricky
    static void myname(String firstname){
        System.out.println(firstname+" "+"Kumar");
    }
    static void checkage(int age){
        if(age>=18){
            System.out.println("Access Granted");
        }else{
            System.out.println("Access Denied");
        }
    }
    static int area(int l,int b){
        return l*b;
    }

    //With method overloading, multiple methods can have the same name with different parameters
    //1)Number of parameters
    //2)Type of parameters
    //3)Order of parameters
    static int plus(int x,int y){
         return x+y;
    }
    static double plus(double x,double y){
        return x+y;
    }


    public static void main(String args[]){
        myfunc();
        myfunc();
        myname("Saiyam");
        myname("Ricky");
        checkage(18);
        checkage(15);
        checkage(20);
        System.out.println(area(10,20));

        System.out.println(plus(2,3));
        System.out.println(plus(2.5,3.5));
    }


}