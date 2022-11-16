import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println(calc.sum(1,2));
        System.out.println(calc.divide(50,2));
        System.out.println(calc.multiply(40, 40));
        System.out.println(calc.substract(1,2));
    }
}