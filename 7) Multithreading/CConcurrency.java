// Threads and main program are reading and writing the same variables, the values are unpredictable. 
public class CConcurrency extends Thread {
    public static int count = 0;
    public static void main(String args[]){
        CConcurrency thread = new CConcurrency();
        thread.start();
        System.out.println(count);
        count++;
        System.out.println(count);

    }
    public void run(){
        count++;
    }  
}
