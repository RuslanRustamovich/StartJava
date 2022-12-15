 package com.Calculator;

import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calc = new Calculator();

        String otvet = "да";
        while(otvet.equals("да")) {

            int number1 = scanner.nextInt();
            calc.setNumber1(number1);

            char operation = scanner.next().charAt(0);
            calc.setOperation(operation);

            int number2 = scanner.nextInt();
            calc.setNumber2(number2);

            calc.calculate();
            do {
                System.out.println("Хотитите продолжить? [да/нет]: ");
                otvet = scanner.next();
            } while(otvet.equals("да") || !otvet.equals ("нет"));
        }
    }
}
