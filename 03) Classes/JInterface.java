//Interface -> Completely a Abstract Class (cant contain Constructor)
//Use methods in interface class without bodies -> Write bodies in implement class
//Java doesnt have multiple inheritence concept -> Achieved by Interface
//Used for achieve security

public class JInterface {
    interface Animal { //First Interface
        public void animalSound();
        public void sleepanimal();
    }
    interface Bird { //Second Interface
        public void birdSound();
        public void sleepbird();
    }
    class Livingbeing implements Animal, Bird { //On place of extends use implements
        public void animalSound() {
            System.out.println("Ani Sound");
        }
        public void sleepanimal() {
            System.out.println("Ani Sleepingggg");
        }
        public void birdSound() {
            System.out.println("bird Sound");
        }
        public void sleepbird() {   
            System.out.println("bird Sleepinggg");
        }
    }
    // Main Method
    public static void main(String[] args) {

        JInterface obj = new JInterface();   // Outer class object
        Livingbeing lb = obj.new Livingbeing();  // Inner class object

        lb.animalSound();
        lb.sleepanimal();
        lb.birdSound();
        lb.sleepbird();
    }
}

