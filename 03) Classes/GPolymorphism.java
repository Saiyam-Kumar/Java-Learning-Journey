// Same method name, different output
// In two words - many forms
// Code reusability: reuse attributes and methods of an existing class
public class GPolymorphism {

    static class Animal {
        public void animalsound() {
            System.out.println("Animal sound");
        }
    }
    //super keyword -> refer to the parent class of a subclass
    //super.method() → call parent’s method
    //super.variable → use parent’s variable
    //super() → call parent’s constructor

    static class Dog extends Animal {
        public void animalsound() {
            super.animalsound(); // calls parent method
            System.out.println("bhau bhau");
        }
    }

    static class Cat extends Animal {
        public void animalsound() {
            super.animalsound(); // calls parent method
            System.out.println("meow meow");
        }
    }

    static class Pig extends Animal {
        public void animalsound() {
            super.animalsound(); // calls parent method
            System.out.println("wee wee");
        }
    }

    public static void main(String[] args) {
        Animal myanimal = new Animal();
        Animal mydog = new Dog();
        Animal mycat = new Cat();
        Animal mypig = new Pig();

        myanimal.animalsound();
        mydog.animalsound();
        mycat.animalsound();
        mypig.animalsound();
    }
}
