package class6;

import java.util.Scanner;

public class NumSize {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number");
        int num = input.nextInt();

        if (num >= 1 && num <= 10) {
            System.out.println("Small number");
        } else if (num >= 11 && num <= 100) {
            System.out.println("Medium number");
        } else if (num >= 101 && num <= 1000) {
            System.out.println("Large number");
        } else {
            System.out.println("Not a valid number");
        }
    }
}
