public class BScope {
    public static void main(String[] args) {
        //variables are only accessible inside the region where they are created

        //1)Method Scope
         // Code here CANNOT use x

         int x = 100;

        // Code here CAN use x
        System.out.println(x);

        //2)Block Scope

        // Code here CANNOT use x {
       // This is a block
      // Code here CANNOT use y
        int y = 100;
      // Code here CAN use x
      System.out.println(y);
        //}
     // The block ends here
    // Code here CANNOT use x
    
    //3)Loop Scope
    for (int i = 0; i < 5; i++) {
      System.out.println(i); // i is accessible here
    }
    // i is NOT accessible here

    }
    
}
