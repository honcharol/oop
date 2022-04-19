package home.work1;

import java.util.Scanner;

public class Armstrong extends Menu{
    public void checkIfArmstr(){
        System.out.println("Enter an Armstrong number (only INTEGER):");
        String number = scan.nextLine();
        isNumber.setString(number);

        while (!isNumber.isInteger()){
            System.out.println("This is not integer! Enter an integer, bitch!");
            number = scan.nextLine();
            isNumber.setString(number);
        }

            char[] arr= number.toCharArray();
            double temp =0;
            for (char c : arr){
                int pow =Integer.parseInt(String.valueOf(c));
                int result = 1;

                for(int y=0; y< arr.length; y++){
                    result = result * pow;
                }
                temp = temp + result;
            }
            System.out.println(temp);
            if(temp == Integer.parseInt(number)){

                System.out.println("!!!!  The number - " + temp + "  is an Armstrong number  !!!!");
                System.out.println("");
            }else{
                System.out.println("The number - " + temp + "  is NOT an Armstrong number.");
                System.out.println("");
            }


    }
}
