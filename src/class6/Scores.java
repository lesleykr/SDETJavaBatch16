package class6;

import java.util.Scanner;

public class Scores {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your quiz score");
        int quiz = input.nextInt();
        System.out.println("Enter your mid-term score");
        int midTerm = input.nextInt();
        System.out.println("Enter your final exam score");
        int finalExam = input.nextInt();

        int avgGrade = (quiz + midTerm + finalExam) / 3;

        if (avgGrade >= 90) {
            System.out.println("Your average grade is A");
        } else if (avgGrade >= 70 && avgGrade < 90) {
            System.out.println("Your average grade is B");
        } else if (avgGrade >= 50 && avgGrade < 70) {
            System.out.println("Your average grade is C");
        } else if (avgGrade < 50) {
            System.out.println("Your average grade is F");
        } else {
            System.out.println("Invalid entry");
        }
    }
}
