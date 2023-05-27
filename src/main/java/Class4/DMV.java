package Class4;

import java.util.Scanner;

public class DMV {
    public static void main(String[] args) {

        Scanner askAge = new Scanner(System.in);
        System.out.println("Please enter your age:");
        int age = askAge.nextInt();

        if (age >= 18){
            System.out.println("You will be receiving a license");
        } else {
            System.out.println("You will be receiving a learner's permit");
        }
    }
}
