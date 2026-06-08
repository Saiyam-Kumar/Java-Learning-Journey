//Nested classes -> a class within class 
//To access innerclass you have to create a obj of outerclass then innerclass obj
//if inner class is private it cant access outside class

class outerclass{
    int x = 5;
class innerclass{
    int y = 6;
    void method(){
        System.out.println("This is inner class");
    }
}
}
class outerclass2{
    int a = 10;
    static class innerclass2{
        int b = 5;

    }
}
public class HInnerClass {
    public static void main(String[] args) {
    outerclass outerobj = new outerclass();
    outerclass.innerclass innerobj =  outerobj.new innerclass();
    System.out.println(innerobj.y+outerobj.x);
    innerobj.method();
    
    //In static inner class -> To access the inner class we dont need to made object of outer class
    outerclass2.innerclass2 innerobj2 = new outerclass2.innerclass2();
    System.out.println(innerobj2.b);
    }
}
