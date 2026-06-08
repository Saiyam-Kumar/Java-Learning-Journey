package MultipleClasses;
public class First {
    public void college(){
        System.out.println("My college Name is Chandigarh University");
        System.out.println("My college has very large infrastructure");
    }
    public int fee(int cfee, int hfee, int efee) {
    int total = cfee + hfee + efee;
    System.out.println(
        "Course fee: " + cfee +
        " Hostel fee: " + hfee +
        " Exam fee: " + efee +
        " Total fee: " + total
    );
    return total;
}

    
}
