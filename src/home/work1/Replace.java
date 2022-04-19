package home.work1;

public class Replace extends Menu {

    public void replaceLetter() {
        System.out.println("Enter a string so that it contains the letter a : ");
        String string = scan.nextLine();
        char[] strArr = string.toCharArray();
        String a = "@";
        char[] ss = a.toCharArray();

        for (int i = 0; i < strArr.length; i++) {
            if (String.valueOf(strArr[i]).equals("a")) {
                strArr[i] = ss[0];
            }
        }
        System.out.println("Here is your string:   " + String.valueOf(strArr));
        System.out.println();
    }
}
