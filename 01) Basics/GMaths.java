public class GMaths {
    public static void main(String[] args) {
        int x = 5;
        int y = 10;
        System.out.println(Math.max(x,y));
        System.out.println(Math.min(x,y));
        System.out.println(Math.abs(-4.89));
        System.out.println(Math.sqrt(64));
        System.out.println(Math.pow(2,3));
        System.out.println(Math.round(7.6));
        System.out.println(Math.ceil(3.4));
        System.out.println(Math.floor(3.9));

        //Random Numbers -> in double form and give number b/w [0.0,1.0)
        System.out.println(Math.random()); 
        int randomnum = (int) (Math.random() * 101); //print num b/w 0-100
        System.out.println(randomnum);
    }
    
}
