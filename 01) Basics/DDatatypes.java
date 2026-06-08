public class DDatatypes {
    public static void main(String args[]){
        //Primitive data type -> built-in and always hold value
        byte num1 = 100;
        System.out.println(num1);

        short  num2 = 10000;
        System.out.println(num2);

        int num3 = 100000;
        System.out.println(num3);

        long num4 = 10000000L;
        System.out.print(num4);

        float num5 = 4.5f;
        System.out.println(num5);

        double num6 = 53.56d;
        System.out.println(num6);

        boolean isJavaFun = true;
        boolean isnotfun = false;
        System.out.println(isJavaFun);
        System.out.println(isnotfun);

        char grade = 'A';
        System.out.println(grade);


        //Non primitve -> Not built-in and can be null ex String ,Array ,Classes
        String name = "Saiyam"; //string is exception it is built-in
        System.out.println(name);
        
        //var-> automatically detect the datatype but intialize with value is must
        var x = 10;
        System.out.println(x);

        //widening typecasting -> automatic
        int val = 5;
        double value = val;
        System.out.println(val);
        System.out.println(value);

        //narrowing typecasting -> manual
        double number = 10.67;
        int newnum = (int) number;
        System.out.println(number);
        System.out.println(newnum);
    }  
}
