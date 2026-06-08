/*
class->implements runnable interface - Thread can be run by passing the instance of the class to a Thread object's constructor -> then call start() method
implementing the Runnable interface, it is possible to extend from another class as well
*/
public class BImplementThread implements Runnable {
    public static void main(String args[]){
        BImplementThread obj = new BImplementThread();
        Thread thread = new Thread(obj);
        thread.start();
        System.out.println("This code is outside of the thread");
    }
    public void run() {
        System.out.println("This code is running in a thread");
    }
}
