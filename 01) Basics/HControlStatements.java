public class HControlStatements{
    public static void main(String args[]){
        //if
            int a = 10;
            if(a>5){
                System.out.println("a is greater than 5");
            }

        // if - else 
            int age = 20;
            if(age>=18){
                System.out.println("You can Vote Coder!");
            }else{
                System.out.println("You can't vote");
            }
        
        //Short Hand if - else
            int time = 20;
            System.out.println((time<18) ? "Good Morning" : "Good Evening");

        //if - else if - else
            String weather = "Cloudy";
            if(weather.equals("Sunny")){
                System.out.println("Wear Sunglasses Coder!");
            }else if(weather.equals("Rainy")){
                System.out.println("Take Umbrella Coder!");
            }else{
                System.out.println("Just enjoy Coder!");
            }

        //Nested if
            int x = 15;
            int y = 25;

            if(x>10){
                System.out.println("x is greater than 10");
                if(y>20){
                    System.out.println("y is also greater than 20");
                }
            }
         //Switch Statement
        int day = 4;
        switch(day){
            case 1:
                System.out.println("Monday");
                break;
    
            case 2:
                System.out.println("Tuesday");
                break;

            case 3:
                System.out.print("Wednesday");
                break;

            case 4:
                System.out.println("Thursday");
                break;

            case 5:
                System.out.println("Friday");
                break;

            case 6:
                System.out.println("Saturday");
                break;

            case 7:
                System.out.println("Sunday");
                break;

            default:
                System.out.println("Invalid Day");
       
            }
        
        //while loop -> if condition is wrong loop will not run
        int i = 0;
        while(i<5){
            System.out.print(i);
            i++;
        }
        System.out.println();

        //do-while loop -> if condition is wrong the loop will excecute 1 time
        int j=0;
        do { 
            System.out.println(j);
            j++;
        } while (i<5);

        //for loop
        for(int k=0; k<6; k++){
            System.out.println("Java");
        }

        //nested for
        for(int m=0; m<5; m++){
            for(int n=0; n<5; n++){
                System.out.print(m+n);
            }
            System.out.println();
        }

        //continue
        for(int z=0; z<4; z++){
            if(z==1){
                continue;
            }
            System.out.print(z);
        }
        System.out.println();

        //break
        for(int r=0; r<4; r++){
            if(r==2){
                break;
            }
            System.out.print(r);
        }
        System.out.println();

    }
}
       