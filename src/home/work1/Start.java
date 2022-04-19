package home.work1;

import java.util.Scanner;

public class Start {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        LogAndPassword lp = new LogAndPassword();
        Menu menu = new Menu();
        EvenNumber even = new EvenNumber();
        Armstrong armstrong = new Armstrong();
        IsNumber isNumber = new IsNumber();
        StringReverse stringReverse = new StringReverse();
        Fibonacci fibonacci = new Fibonacci();
        Replace replace = new Replace();

        lp.CheckLogPass();
        menu.CheckMenu();

        String y = scan.nextLine();
        isNumber.setString(y);
        if (isNumber.isInteger()){
            int i = Integer.parseInt(y);
            while (i>=1 && i<=5 && isNumber.isInteger()){
                switch (i) {
                    case 1: {
                        even.CheckEveNum();
                        menu.CheckMenu();
                        String q = scan.nextLine();
                        isNumber.setString(q);
                        if (isNumber.isInteger()){
                            i = Integer.parseInt(q);
                        }else  System.out.println("GOODBYE !!!");
                        break;
                    }
                    case 2: {
                        armstrong.checkIfArmstr();
                        menu.CheckMenu();
                        String q = scan.nextLine();
                        isNumber.setString(q);
                        if (isNumber.isInteger()){
                            i = Integer.parseInt(q);
                        }else  System.out.println("GOODBYE !!!");
                        break;
                    }
                    case 3: {
                        stringReverse.strToReverse();
                        menu.CheckMenu();
                        String q = scan.nextLine();
                        isNumber.setString(q);
                        if (isNumber.isInteger()){
                            i = Integer.parseInt(q);
                        }else  System.out.println("GOODBYE !!!");
                        break;
                    }
                    case 4: {
                        fibonacci.countFibonacci();
                        menu.CheckMenu();
                        String q = scan.nextLine();
                        isNumber.setString(q);
                        if (isNumber.isInteger()){
                            i = Integer.parseInt(q);
                        }else  System.out.println("GOODBYE !!!");
                        break;
                    }
                    case 5: {
                        replace.replaceLetter();
                        menu.CheckMenu();
                        String q = scan.nextLine();
                        isNumber.setString(q);
                        if (isNumber.isInteger()){
                            i = Integer.parseInt(q);
                        }else  System.out.println("GOODBYE !!!");
                        break;
                    }
                }
            }
        }else {
            System.out.println("GOODBYE !!!");
        }


    }
}
