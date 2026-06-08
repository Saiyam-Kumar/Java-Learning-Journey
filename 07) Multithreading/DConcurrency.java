//To avoid Concurrency
public class DConcurrency extends Thread{
    public static int count = 0;
    public static void main(String[] args) {
        DConcurrency thread = new DConcurrency();
        thread.start();
        
        // Wait for the thread to finish
        while(thread.isAlive()){
            System.out.println("Waiting...");

        // Update count and print its value
        System.out.println("Main: " + count);
        count++;
        System.out.println("Main: " + count);
        }
    }
    public void run(){
           count++;
    }
}
