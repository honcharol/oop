package edu.honchar.ooplessons;

public class Main {
    public static void main(String[] args) {
        FractionNumbers fn = new FractionNumbers(2,3);
        fn.Sum();
        System.out.println(fn);
        fn.Multiply();
        System.out.println(fn);
        fn.Minus();
        System.out.println(fn);
        fn.Divide();
        System.out.println(fn);
    }
}
