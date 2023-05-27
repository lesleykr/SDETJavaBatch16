package class6;

import java.util.Scanner;

public class Language {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your country");
        String country = input.next();

        if (country.equals("USA")) {
            System.out.println("Your language is English");
        } else if (country.equals("Mexico")) {
            System.out.println("Your language is Spanish");
        } else if (country.equals("France")) {
            System.out.println("Your language is French");
        }
    }
}
