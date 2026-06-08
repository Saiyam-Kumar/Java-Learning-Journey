public class EOperaters {
    public static void main(String args[]){
        //Arithmetic Operaters
        int x = 10;
        int y = 5;
        System.out.println(x+y);
        System.out.println(x-y);
        System.out.println(x*y);
        System.out.println(x/y);
        System.out.println(x%y);
        ++x;
        System.out.println(x);
        --y;
        System.out.println(y);
        
        //Assignment Operators
        int a = 10;
        a += 5;
        System.out.println(a);
        a -= 5;
        System.out.println(a);
        a *= 5;
        System.out.println(a);
        a /= 5;
        System.out.println(a);
        a %= 5;
        System.out.println(a);

        //Comparision Operators
        int b = 18;
        System.out.println(b==18);
        System.out.println(b<=18);
        System.out.println(b>=18);
        System.out.println(b<18);
        System.out.println(b>18);
        System.out.println(b!=18);

        //Logical Operator
        int q=5,r=6;
        if(q==5 && r==6){
            System.out.println("Have fun");
        }
        if(q==2 || r==7){
            System.out.println("Java is Love");
        }else{
            System.out.println("Bad Luck");
        }
        if(!(q==4 && r==7)){
            System.out.println("Coding so Addictive");
        }
        }
        //Precedence is order (),*,/,%,+,-
    
}
