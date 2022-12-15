package com.Calculator;

public class Calculator {

    private int number1;
    private char operation;
    private int number2;

    public void setNumber1(int number1){
        this.number1 = number1;
    }
    public void setOperation(char operation) {
        this.operation = operation;
    }
    public void setNumber2(int number2) {
        this.number2 = number2;
    }


    public void calculate() {
        switch(operation) {
            case '+' :
                System.out.println(number1 + number2);
                break;
            case '-' :
                System.out.println(number1 - number2);
                break;
            case '/' :
                System.out.println(number1 / number2);
                break;
            case '*' :
                System.out.println(number1 * number2);
                break;
            case '%' :
                System.out.println(number1 % number2);
                break;
            case '^' :
                pow();
        }
    }
    private void pow() {
        int result = 1;
        for(int i = 0; i < number2; i++) {
        result = result * number1;
    }
        System.out.println(result);
    }
}
