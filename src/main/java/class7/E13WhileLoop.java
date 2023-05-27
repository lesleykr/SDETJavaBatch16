package class7;

import java.util.Scanner;

public class E13WhileLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = input.nextInt();
        int i = 1;

        while(i <= num){
            System.out.println(i);
            i++;
        }
    }
}
