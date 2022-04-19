package edu.honchar.ooplessons;

public class FractionNumbers {
    private double number1;
    private double number2;
    private double result;

    public FractionNumbers(int num1, int num2) {
        this.number1 = num1;
        this.number2 = num2;
    }

    public void Sum() {
        result = number1 + number2;
    }
    public void Minus() {
        result = number1 - number2;
    }
    public void Multiply() {
        result = number1 * number2;
    }
    public void Divide() {
        result = number1 / number2;
    }

    @Override
    public String toString (){
        return String.valueOf(result);
    }

}
