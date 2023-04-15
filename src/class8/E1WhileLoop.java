package class8;

import java.util.Scanner;

public class E1WhileLoop {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter starting number:");
        int start = input.nextInt();
        System.out.println("Enter ending number:");
        int end = input.nextInt();
        System.out.println("Please enter step");
        int step = input.nextInt();

        while(start <= end){
            System.out.print(start + " ");
            start+=step;
        }

    }
}
