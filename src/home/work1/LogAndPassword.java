package home.work1;

import java.util.Scanner;

public class LogAndPassword {
    private String loginUser = "";
    private String passUser = "";


    public void CheckLogPass() {
        Scanner scan = new Scanner(System.in);
        String login = "Kurva";
        String pass = "1912";
        while (!loginUser.equals(login) || !passUser.equals(pass)) {
            System.out.println("Enter the login:");
            loginUser = scan.nextLine();
            System.out.println("Enter the Password:");
            passUser = scan.nextLine();
            if (loginUser.equals(login) && passUser.equals(pass)) {
                System.out.println("WELCOME !!!");
                System.out.println();
            } else
                System.out.println("Password or Login is incorrect! Try again!");

        }
    }
}
