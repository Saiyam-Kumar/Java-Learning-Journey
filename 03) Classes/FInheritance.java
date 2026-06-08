// Inheritance means inheriting attributes and methods from another class - reuse code
public class FInheritance {

    // Parent class => (Super-class)
    static class Vehicle {
        protected String model = "Ford";

        public void horn() {
            System.out.println("honk honk");
        }
    }

    // Child class => (Sub-class)
    static class Car extends Vehicle {  //used extend keyword
        private String carname = "Mustang";

        public static void main(String[] args) {
            Car mycar = new Car();

            mycar.horn();
            System.out.println(mycar.carname + " " + mycar.model);
        }
    }
}
