public class JavaDataTypesVariablesAndLiteralsE1 {
    public static void main(String[] args) {
        //Exercise 2.1.3
        //For each of the following values, identify whether or not the value is a string, character, integer number, floating point number, or invalid.
        //"Programming is fun." - string
        //"PROG10082" - string
        //10082 integer
        //"10082" string
        //10,082 long
        //"$5.95" string
        //'2' char
        //2 int
        //2.99991 float
        //'\t\n' -> arent dataTypes they are used to:
        // \n -> going to the next line, it can be used anywhere and print the statement;
        // \t is used for exactly five spaces.
        //"\t\n"
        //Write statements to declare and assign literals as per data types chosen in part a.
       String string = ("Programming is fun.");
       String str2 = ("PROG10082");
       int num = 10082;
       String str3 = ("10082");
       float l1 = 10_082F;
       String str4 = ("$5.95");
       char c2 = '2';
       int num1 = 2;
       float l2 = 2.99991f;
        System.out.println(string);
        System.out.println(str2);
        System.out.println(num);
        System.out.println(str3);
        System.out.println(l1);
        System.out.println(str4);
        System.out.println(c2);
        System.out.println(num1);
        System.out.println(l2);

        // Exercise 2.1.6
        //Write a program that declares and initiates the numeric values shown below using the minimum required memory space. Print the values and their type on the console.
        //
        //2,130,125,958
        //2,234,567,890
        //-32,000
        //-9,567,567.98
        //125
        //d
        //false

        long longNumber1 = 2_130_125_958L;
        long longNumber2 = 2_234_567_890L;
        float floatNumber1 = -32.000f;
        long longNumber3 = -9_567_567_98L;
        int integer1 = 125;
        char char1 = 'd';
        boolean age = (10 - 2 == 2);
// "My courses:\n PROG10082\n SYST10049\n TELE13176\n COMM13729\n MATH18584\n CULT10001G");
        System.out.println("The outputs:" + longNumber1 + "\n" + longNumber2 +  "\n" + floatNumber1 +
                "\n" + longNumber3 + "\n" + integer1 + "\n" + char1 +  "\n" + age);

        // Exercise 2.1.7
        //Create a new program and define a constant called COLLEGE_NAME. Give the constant the value "Sheridan College".
        //
        //In your main() method, add the following statements:
        //
        //System.out.println("You attend " + COLLEGE_NAME + ".");
        //COLLEGE_NAME = "Sheridan College Institute of Technology and Advanced Learning";
        //System.out.println("You should really call it " + COLLEGE_NAME);
        //
        //What happens when you compile this program? Why?

        String COLLEGE_NAME = "Sheridan College";

        System.out.println("You attend " + COLLEGE_NAME + ".");
        COLLEGE_NAME = "Sheridan College Institute of Technology and Advanced Learning";
        System.out.println("You should really call it " + COLLEGE_NAME);



    // Exercise 2.1.4
    //For each of the following statements below, declare a variable and initialize it to a null value. Use the most appropriate data types and identifier names.
    //
    //to store a customer's last name
    //to record the number of customers
    //to record the customer's outstanding balance
    //to store the customer's phone number

        String costumersLastName = "";
        int numberOfCostumers = 0;
        double outstandingBalance = 0.0D;
        String costumersPhone = ("");
        System.out.println(costumersLastName);
        System.out.println(numberOfCostumers);
        System.out.println(outstandingBalance);
        System.out.println(costumersPhone);
//

        String first = "Fred";
        String last = "Foo";
        first = last;
        System.out.println(first);
        System.out.println(last);

    }

}
