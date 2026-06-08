// -------- ABSTRACT CLASS --------
// abstract class cannot be instantiated (object cannot be created)
// it can contain abstract and non-abstract methods
abstract class Human {

    // abstract method has no body
    // it must be implemented by subclass
    abstract void work();

    // normal method inside abstract class
    void breathe() {
        System.out.println("Human is breathing");
    }
}

// -------- DEFAULT ACCESS CLASS --------
class Person extends Human {

    private int income = 50000;  // private variable

    // public method to access private variable (Encapsulation)
    public int getIncome() {
        return income;
    }

    // implementation of abstract method
    @Override
    void work() {
        System.out.println("Person is working to earn money");
    }
}

// For a class, only public and default access modifiers are allowed
public class CModifiers {

    // <-------  Access Modifiers ------->
    // public    -> accessible from anywhere
    // default   -> accessible within the same package
    // private   -> accessible only within the same class
    // protected -> accessible within same package and subclasses

    public final String name = "Saiyam";        // public + final
    private int age = 20;                       // private
    protected String uid = "24BCS10108";         // protected
    // default String place;                    // default


    // <-------  Non-Access Modifiers ------->
    // final    -> value cannot be changed
    // static   -> belongs to class, not object
    // abstract -> used to achieve abstraction (hides implementation)

    final String section = "715-A";              // final variable

    // static method
    static void ex() {
        System.out.println("we can print this without creating object");
    }

    public static void main(String[] args) {

        // object of normal class
        CModifiers obj = new CModifiers();

        // object of subclass (Person)
        Person obj1 = new Person();

        // access public and private members (same class)
        System.out.println(obj.name);
        System.out.println(obj.age);   // allowed (same class)

        // not allowed (private variable of another class)
        // System.out.println(obj1.income);

        // correct way (via public method)
        System.out.println("Income: " + obj1.getIncome());

        // calling static method
        ex();

        // calling abstract method implementation
        obj1.work();

        // calling non-abstract method from abstract class
        obj1.breathe();
    }
}


