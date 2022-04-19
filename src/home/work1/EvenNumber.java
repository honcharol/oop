package home.work1;

import java.util.Scanner;

public class EvenNumber extends  Menu{
    public void CheckEveNum(){

        System.out.println("Enter an any integer :");
        String num = scan.nextLine();
        isNumber.setString(num);

        while (!isNumber.isInteger()){
            System.out.println("This is not integer! Enter an integer, bitch!");
            num = scan.nextLine();
            isNumber.setString(num);
        }
        if (Integer.parseInt(num) %2 == 0){
            System.out.println("The number - " + num + " - is EVEN NUMBER ");
            System.out.println("");
        }else {
            System.out.println("The number - " + num + " - is ODD NUMBER ");
            System.out.println("");
        }


    }
}
