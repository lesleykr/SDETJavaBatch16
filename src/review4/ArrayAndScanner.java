package review4;

import java.util.Scanner;

public class ArrayAndScanner {
    public static void main(String[] args) {
        /*Create an array that stores numbers from a user
        and then we want to calculate the average of numbers
         */
        Scanner input = new Scanner(System.in);
        System.out.println("How many integers you want to store?");
        int size=input.nextInt();

        int[] numbers = new int[size];


        for (int i = 0; i <= size ; i++) {
            System.out.println("Please enter "+i+1+"element");
            numbers[i]=input.nextInt();
        }
    }
}
