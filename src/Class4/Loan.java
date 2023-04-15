package Class4;

import java.util.Scanner;

public class Loan {
    public static void main(String[] args) {

        Scanner loanScan = new Scanner(System.in);
        System.out.println("Please enter loan amount:");
        int loanAmount = loanScan.nextInt();

        if (loanAmount <= 200000){
            System.out.println("Your loan has been approved!");
        } else {
            System.out.println("Your loan request has been rejected");
        }
    }
}
