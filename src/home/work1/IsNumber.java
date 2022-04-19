package home.work1;

public class IsNumber {
    private String string;

    public void  setString(String str){
        this.string = str;
    }

    public boolean isInteger(){
        try {
            Integer.parseInt(string);
            return true;
        } catch (NumberFormatException e) {

            return false;
        }
    }

    public boolean IsDouble(){
        try {
            Double.parseDouble(string);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }


}
