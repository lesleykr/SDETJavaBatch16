package class6;

import java.lang.invoke.SwitchPoint;
import java.util.Scanner;

public class Season {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your birth month");
        String month = input.next();

        switch (month) {
            case "March":
            case "April":
            case "May":
                System.out.println("You were born in the spring");
                break;
            case "June":
            case "July":
            case "August":
                System.out.println("You were born in the summer");
                break;
            case "September":
            case "October":
            case "November":
                System.out.println("You were born in the fall");
                break;
            case "December":
            case "January":
            case "February":
                System.out.println("You were born in the winter");
                break;
            default:
                System.out.println("Invalid entry");

        }
    }
}
