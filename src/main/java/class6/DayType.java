package class6;

import java.util.Scanner;

public class DayType {
    public static void main(String[] args) {
        String message = "";
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the day number");
        int dayNum = input.nextInt();

        switch (dayNum) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                message = "It is a weekday";
                break;
            case 6:
            case 7:
                message = "It is a weekend";
                break;
            default:
                message = "Invalid day";
        }
        System.out.println(message);
    }
}
