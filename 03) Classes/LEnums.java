//Enums -> Class that represent the group of constants
public class LEnums {

    enum Level{
        LOW("Low Level"), //must be in uppercase letters
        MEDIUM("Medium Level"),//unchangeable values -> can't be overridden
        HIGH("High Level");//use like in month days
        
        //Variable
        private String description;
        
        //Constructor -> call automatically
        private Level(String description){
            this.description = description;
        }
        
        //Getter method
        public String getdescription(){
            return description;
        }
    }

    public static void main(String[] args) {
        Level myvar = Level.MEDIUM; //cant create objects or extend classes but can implement interfaces
        System.out.println(myvar);

        System.out.println(myvar.getdescription());//print description
        
        //Loop -> return array of all enum constants
        for(Level var : Level.values()){  //values() -> method
            System.out.println(var);
        }
        //Loop -> through enum with constructor
        for (Level var : Level.values()) {
            System.out.println(var + ": " + var.getdescription());
        }

        //Check corresponding values -> Switch statement
        switch(myvar){
            case LOW:
            System.out.println("Low Level");
            break;

            case MEDIUM:
            System.out.println("Medium Level");
            break;

            case HIGH:
            System.out.println("High Level");
            break;
        }
    }
}
