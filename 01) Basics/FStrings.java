public class FStrings {
    public static void main(String args[]){
        String name1 = "Saiyam";
        String name2 = "Kumar";
        String name3 = "     Hello World      ";
        //String Methods
        System.out.println(name1.length());
        System.out.println(name1.toUpperCase());
        System.out.println(name1.toLowerCase());
        System.out.println(name1.indexOf("am"));
        System.out.println(name1.charAt(2));
        System.out.println(name1.equals(name2));
        System.out.println(name3);
        System.out.println(name3.trim()); //remove whitespaces

        //Concatenation
        System.out.println(name1 + " " + name2);
        System.out.println(name1.concat(name2));
        
        // '+' Add numbers and also '+' concates strings
        System.out.println(10+20);
        System.out.println("10"+"20");

        //Special characters
        //String mood = "My mood is \ to code "day" and 'night'"; confuse string
        String mood = "My mood is \\ to code \"day\" and \'night\'"; //use these escape characters
        System.out.println(mood);


    }
}
