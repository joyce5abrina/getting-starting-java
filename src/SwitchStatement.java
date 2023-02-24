import java.util.Scanner;

public class SwitchStatement {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the day: ");
        int numberOfDays = input.nextInt();
        String day = "";

        switch (numberOfDays) {
            case 1:
                day = "Sunday";
                //System.out.println("Sunday");

                break;
            case 2:
                day = "Monday";
                //System.out.println("Monday");
                break;
            case 3:
                day = "Tuesday";
               // System.out.println("Tuesday");
                break;
            case 4:
                day = "Wednesday";
                //System.out.println("Wednesday");
                break;
            case 5:
                day = "Thursday";
                //System.out.println("Thursday");
                break;
            case 6:
                day = "Friday";
               // System.out.println("Friday");
                break;
            case 7:
                day = "Saturday";
                //System.out.println("Saturday");
                ;
                break;
            default:

                System.out.println("You have to choose a number from 1 to 7");
        }
        System.out.println("The day is " + day);

    }
}
