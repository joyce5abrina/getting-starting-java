import java.util.Scanner;
public class AssignmentsAndArithmeticExpressionsExercises {

    public static void main(String[] args){


       //Exercise 2.2.6
       // In the expression below, identify the order in which the operations would be done, from 1 (highest precedence) to 3 (lowest precedence):

        //System.out.println(a * b > (c + d));
// the brackets is gonna be read first;
        // the second one will be multiplication
        // the last one will be the greater than;

        //20 - 5 / 2 + 3
        //20 - 5 / (2 + 3)
        //10 * (1 + 7 * 3)
        //15 % 3
        //10 + 5 % 2
        //10 * 5 % 2

        System.out.println((20 - 5) / (2 + 3));
        System.out.println((20 - 5) / (2 + 3));
        System.out.println((10 * 1) + ( 7 * 3));
        System.out.println(15 % 3);
        System.out.println(10 + 5 % 2);
        System.out.println((10 * 5) % 2);








        }



}


