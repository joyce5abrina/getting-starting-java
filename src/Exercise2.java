import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        String firstName;
        String lastName;
        String x = "x";
       // System.out.println(x);
        String fullName;


        do {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter your First Name: ");
            firstName = input.nextLine();
            System.out.println("Enter your Last Name: ");
            lastName = input.nextLine();
            System.out.println("Hello " + firstName + " " + lastName);
            fullName = (firstName + lastName);
            System.out.println(fullName);
            System.out.println(firstName.equals(x));
            System.out.println( lastName.equals(x));
        }
        while (!firstName.equals(x) && !lastName.equals(x));

    }



}





