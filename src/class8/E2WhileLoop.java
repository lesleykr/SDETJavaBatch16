package class8;

import java.util.Scanner;

public class E2WhileLoop {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter number:");
        int num = input.nextInt();

        while(num != -1){
            System.out.println("Try Again:");
            num = input.nextInt();
        }

   /*     do{
            System.out.println("Try Again:");
            num = input.nextInt();
        } while(num != -1);*/

        }
    }

