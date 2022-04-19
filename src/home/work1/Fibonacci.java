package home.work1;

import java.util.Scanner;

public class Fibonacci extends Menu {

    public void countFibonacci() {
        System.out.println("Enter an amount of Fibonacci numbers (no more then 50): ");
        String amount = scan.nextLine();
        isNumber.setString(amount);

        while (!isNumber.isInteger() || Integer.parseInt(amount) > 50) {
            System.out.println("This is not integer or >50 !!! Enter the correct value, bitch!");
            amount = scan.nextLine();
            isNumber.setString(amount);
        }

        int length = Integer.parseInt(amount);
        int[] arrFibon = new int[length];
        arrFibon[0] = 1;
        arrFibon[1] = 1;
        StringBuilder a = new StringBuilder();
        for (int i = 2; i < length; i++) {
            arrFibon[i] = arrFibon[i - 1] + arrFibon[i - 2];
        }
        for (int y = 0; y < length; y++) {
            a.append(arrFibon[y]).append("; ");
        }
        System.out.println(a);
    }
}
