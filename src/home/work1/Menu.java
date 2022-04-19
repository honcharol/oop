package home.work1;

import java.util.Scanner;

public class Menu {
    protected Scanner scan = new Scanner(System.in);
    protected IsNumber isNumber = new IsNumber();
    public void CheckMenu(){
        System.out.println(">>>> Select the required task :");
        System.out.println("1. Even Number <<<<");
        System.out.println("2. Armstrong <<<<<<");
        System.out.println("3. Reverse string <");
        System.out.println("4. Fibonacci <<<<<<");
        System.out.println("5. Replace a to @ <");
        System.out.println("!!!  TO STOP, press any key except 1, 2, 3, 4 or 5  !!!");
    }



}
