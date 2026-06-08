class College {

    // private data member (data hiding)
    private String name;

    // Getter method (read-only access)
    public String getName() {
        return name;
    }

    // Setter method (write access)
    public void setName(String newname) {
        this.name = newname;
    }
}

public class DEncapsulation{

    // Encapsulation:
    // Wrapping data (variables) and methods together into a single unit
    // It provides better control, security, and data hiding

    public static void main(String[] args) {

        // Creating object of College class
        College obj = new College();

        // Setting value using setter
        obj.setName("Chandigarh University");

        // Getting value using getter
        System.out.println(obj.getName());
    }
}

