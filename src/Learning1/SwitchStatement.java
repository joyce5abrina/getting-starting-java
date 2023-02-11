package Learning1;

public class SwitchStatement {
    public static void main(String[] args) {
//Switch Statement 
        String gender = "MALE";
        if (gender.equals("FEMALE")) {

        } else if (gender.equals("MALE")) {

        } else if (gender.equals("PREFER_NOT_SAY")) {

        } else {

        }

        switch (gender) {
            case "FEMALE":
                System.out.println("I am a female");
                break;
            case "MALE":
                System.out.println(" I am a male");
                break;
            case "PREFER_NOT_SAY":
                System.out.println("prefer not say");
                break;
            default:
                System.out.println("Unknown gender");

        // Display with Switch Statements the days of the week;

                int day = 5;
                switch (day) {
                    case 1:
                        System.out.println("Monday");
                        break;
                    case 2:
                            System.out.println("Tuesday");
                            break;
                    case 3:
                        System.out.println("Wednesday");
                        break;
                    case 4:
                        System.out.println("Thursday");
                        break;
                    case 5:
                        System.out.println("Friday");
                        break;
                    case 6:
                        System.out.println("Saturday");
                        break;
                    case 7:
                        System.out.println("Sunday");
                        break;


                }
        }
    }
}
