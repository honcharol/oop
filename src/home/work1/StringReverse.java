package home.work1;

public class StringReverse extends Menu{

    public void strToReverse() {
        System.out.println("Enter a string:");
        String string = scan.nextLine();
        char[] strArr = string.toCharArray();
        char temp;

        for (int i = 0; i < strArr.length; i++) {
            for (int j = i; j < strArr.length; j++) {

                temp = strArr[i];
                strArr[i] = strArr[j];
                strArr[j] = temp;

            }
        }
        System.out.println("Here is your reversed string:   " + String.valueOf(strArr));
        System.out.println();

    }

}
