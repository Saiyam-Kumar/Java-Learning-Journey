//process of hiding certain details and showing only essential information to the user -> We can access abstract class by inheriting it by other class

    abstract class Animal{
        // Abstract method (does not have a body)
        public abstract void animalSound();
        void sleep(){
            System.out.println("I m sleeping");
        }
    }
    class Pig extends Animal{
        @Override
        public void animalSound(){
            System.out.println("Wee-Wee");
        }
    }
    public class IAbstraction {
    public static void main(String[] args) {
        Pig mypig = new Pig();
        mypig.animalSound();
        mypig.sleep();
    }


}  

