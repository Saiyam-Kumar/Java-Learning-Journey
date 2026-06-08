public class AOops {
    int x = 5;  //x is a Attribute (variable declared inside a class)
    int y;
    String name = "Saiyam";
    String uid = "24bcs10108";
    int age = 19;

    //Methods in class
    static void color(){
        System.out.println("The color of car is black");
    }

    static int speed(int spd){
        return spd;
    }
    public static void main(String[] args) {
        //Java is OOPs -> Creating objects that contain both data and methods in class
        //DRY->Dont repeat yourself (No code is repeated)

        //Class -> Template or Blueprint for Objects for ex: Car
        //Object -> Instance of class for ex:Volvo,Audi,BMW
        
        //Madde multiple objects
        AOops obj1 = new AOops();
        System.out.println(obj1.x);

        AOops obj2 = new AOops();
        System.out.println(obj2.x);

        AOops obj3 = new AOops();
        obj3.y = 45;
        System.out.println(obj3.y);

        AOops obj4 = new AOops();
        obj4.x = 10; //override value  (if use final keyword we can change value)
        System.out.println(obj4.x);

        AOops obj5 = new AOops();
        System.out.println("The name of the student : "+obj5.name);
        System.out.println("The uid of student :"+obj5.uid);
        System.out.println("The age of student :"+obj5.age);

        AOops mycar = new AOops();
        mycar.color();
        System.out.println(mycar.speed(200));

    }
    
}
