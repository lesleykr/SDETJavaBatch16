package class6;

import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your grade");
        char grade = input.next().charAt(0);

        String beg = "Your grade of " + grade + " is ";

        switch (grade) {
            case 'A':
                System.out.println(beg + "excellent");
                break;
            case 'B':
                System.out.println(beg + "good");
                break;
            case 'C':
                System.out.println(beg + "average");
                break;
            case 'D':
                System.out.println(beg + "bad");
                break;
            default:
                System.out.println(beg + "not acceptable");
        }
    }
}
