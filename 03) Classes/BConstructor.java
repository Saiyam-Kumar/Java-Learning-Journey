public class BConstructor {

    // Used to initialize the object (called at the time of object creation)
    // Constructor name must be same as class name

    // this keyword in Java refers to the current object
    // It is used to differentiate between instance variables and parameters

    int modelyear;   
    String modelname;  
    String color;      

    // First constructor with 2 variables
    // This constructor gives a DEFAULT value to color
    BConstructor(int modelyear, String modelname) {
        this.modelyear = modelyear;
        this.modelname = modelname;

        // Default value assigned to color
        this.color = "Black";
    }

    // Second constructor with 3 variables
    // Constructor overloading is used here
    BConstructor(int modelyear, String modelname, String color) {

        // this() is used to call another constructor of the same class
        // It must be the FIRST statement inside the constructor
        this(modelyear, modelname);

        // Overriding the default color value
        this.color = color;
    }

    void display() {
        System.out.println("Model Year : " + modelyear);
        System.out.println("Model Name : " + modelname);
        System.out.println("Color      : " + color);
    }

    public static void main(String args[]) {
        BConstructor obj1 = new BConstructor(2006, "Audi A6");
        obj1.display();

        System.out.println();

        BConstructor obj2 = new BConstructor(2023, "BMW X5", "White");
        obj2.display();
    }
}

