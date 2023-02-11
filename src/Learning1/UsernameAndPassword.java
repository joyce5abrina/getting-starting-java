package Learning1;

import java.util.Scanner;

public class UsernameAndPassword {

    public static void main(String[] args) {

        Scanner login = new Scanner(System.in);
        //step 1 -> prompt create login and password;
        // step 2 -> scan to get the new usrrname and new password;
        //compare the new user and pass with the test;

        System.out.println("Create your new login: ");
        String userNameSaved = login.nextLine();
        System.out.println("Create your new password: ");
        String passwordSaved = login.nextLine();


        System.out.println("Test login: ");
        System.out.println("Enter the username: ");
        String userName = login.nextLine();
        System.out.println("Enter the password: ");
        String password = login.nextLine();




// to compare strings in Java use: .equals() and avoid ==
        if (userName.equals(userNameSaved) && password.equals(passwordSaved)) {
            System.out.println("You are logged! ");
        } else {
            System.out.println("Wrong credentials!  ");


        }
    }
}