public class IArrays{
    public static void main(String[] args) {
        int[] arr = {10,20,30,40};
        System.out.println(arr[0]);
        System.out.println(arr[3]);

        String[] names = {"Saiyam","Krish","Akhil"};
        System.out.println(names[1]);
        System.out.println(names.length);
        names[1] = "Rohit";
        System.out.println(names[1]);

        //Use new Keyword -> to first give fixed length and then fill elements
        String[] cars = new String[4];
        cars[0] = "Audi";
        cars[1] = "BMW";
        cars[2] = "Alto";
        cars[3] = "Verna";
        for(int i=0; i<cars.length; i++){
            System.out.println(cars[i]);
        }

        for(String val:cars){
            System.out.println(val);
        }

        //2d Array
        int[][] myNumbers = { {1, 4, 2}, {3, 6, 8, 5, 2} };

        for (int row = 0; row < myNumbers.length; row++) {
        for (int col = 0; col < myNumbers[row].length; col++) {
         System.out.println("myNumbers[" + row + "][" + col + "] = " + myNumbers[row][col]);
  }
}
    }
    
}