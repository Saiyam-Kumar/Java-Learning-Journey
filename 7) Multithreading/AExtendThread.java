/*
Allows a program to operate more efficiently by doing multiple things at the same time
Perform complicated tasks in the background without interrupting the main program
when a class extends the Thread class, you cannot extend any other class
*/
public class AExtendThread extends Thread{
        public static void main(String[] args) {
            AExtendThread thread = new AExtendThread();
            thread.start();
            System.out.println("This code is outside of the thread");
        }
        public void run() { //overriding its run method
            System.out.println("This code is running in a thread");
        }
}
