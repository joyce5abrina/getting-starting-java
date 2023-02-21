import java.util.Scanner;
public class BasicSelectionStatements {
    public static void main(String[] args) {
        //Exercise 6.1.1
        //Ask the user for a whole number. Display a message on the screen that indicates whether the number is positive or negative. Consider 0 as a positive, since it does not contain a negative sign at the front.

        // step one: create a scanner;
        Scanner input = new Scanner(System.in);
        System.out.printf("%-22s","Enter a whole number: ");
        int wholeNumber = input.nextInt();
        System.out.println(wholeNumber);

        //step two: Display a message if the number is positive or negative

        if (wholeNumber >= 0)  {
            System.out.printf("%d/s","The number is positive.");
        } else{
            System.out.printf("%d/s","The number is negative");
        }










    }
}
