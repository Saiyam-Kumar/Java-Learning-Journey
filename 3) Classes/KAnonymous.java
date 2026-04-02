//Anonymous -> class without name
//Created and used at same time
    class Animal{
        public void makeSound(){
            System.out.println("Animal Sound");
        }
    }

public class KAnonymous{
public static void main(String args[]){
    // Anonymous class that overrides makeSound()
    Animal myanimal = new Animal(){
        
        public void makeSound(){
            System.out.println("wow-wow");
        }
    }; //end with semicolon -> statement

    myanimal.makeSound();
}
}