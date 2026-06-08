public class CPrograms {
    public static void main(String[] args) {

        // String concatenation
        String firstName = "Saiyam";
        String lastName = "Kumar";
        String fullName = firstName + lastName;
        System.out.println("Full Name : " + fullName);

        // Sum of variables
        int x = 5;
        int y = 10;
        System.out.println("The sum of x and y : " + (x + y));

        // Concatenation vs Addition
        System.out.println("The sum of x and y : " + x + y);

        int q = 50, r = 40, s = 30;
        System.out.println("The sum of q, r, s : " + (q + r + s));

        // College Student Information
        String myName = "Saiyam Kumar";
        String uid = "24bcs10108";
        int age = 19;
        float studentFee = 75.44f;
        char grade = 'A';

        System.out.println("\nStudent Information:");
        System.out.println("Name : " + myName);
        System.out.println("UID : " + uid);
        System.out.println("Age : " + age);
        System.out.println("Student Fee : " + studentFee);
        System.out.println("Grade : " + grade);

        // Area of Rectangle
        int length = 5;
        float width = 4.5f;
        float area = length * width;

        System.out.println("\nArea of Rectangle : " + area);
    }
}
