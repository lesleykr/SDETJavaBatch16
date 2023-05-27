package class6;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the first number");
        int num1 = input.nextInt();
        System.out.println("Please enter the second number");
        int num2 = input.nextInt();
        System.out.println("Please enter the operator");
        char operator = input.next().charAt(0);
        int result = 0;

        if (operator == '+') {
            result = num1 + num2;
            System.out.println("The result is " + result);
        } else if (operator == '-') {
            result = num1 - num2;
            System.out.println("The result is " + result);
        } else if (operator == '*') {
            result = num1 * num2;
            System.out.println("The result is " + result);
        } else if (operator == '/') {
            result = num1 / num2;
            System.out.println("The result is " + result);
        } else {
            System.out.println("The operation is not valid");
        }
    }
}
