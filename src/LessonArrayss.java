import java.util.Arrays;

public class LessonArrayss {

    public static void main(String[] args) {
        // Arrays

        int zero = 0;
        int one = 1;
        int [] numbers = {2,0,1,100};
        //int [] numbers = new int [4];
      //  numbers [0] = 0;
      //  numbers [1] = 1;
    //    numbers [2] = 1;
    //    numbers [4] = 2;
        System.out.println(Arrays.toString(numbers));

        String [] number = new String [3];
        String [] names = {"Ali", "Maria"};
        System.out.println(Arrays.toString(number));
        System.out.println(number.length);
        System.out.println(Arrays.toString(names));
        System.out.println(names.length);


        // Exercise:
        //Create an array of type String called cars.
        //
        //
        //
        //
        // = {"Volvo", "BMW", "Ford"}
        String [] cars = {"Volvo", "BMW", "Ford"};
        System.out.println(Arrays.toString(cars));
        System.out.println(cars[1]);
        System.out.println(cars[2]);
        System.out.println(cars[0]);

// Arrays and indexes
        int [] numb = {2, 0, 1 ,90, 100};
        int oneHundred = numb [4];
        int four = numb [numb.length -1];
        System.out.println(oneHundred);
        System.out.println(four);
// change an Array Element
        //  String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
       // cars[0] = "Opel";
      //  System.out.println(cars[0]);
// Now outputs Opel instead of Volvo
    }




    }

