package class6;

import java.time.LocalTime;
import java.util.Scanner;

public class Hour {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the time (hh:mm 24 hr format)");
        String time = scan.next();
        LocalTime lt = LocalTime.parse(time);
        int hours = lt.getHour();

        if (hours >= 1 && hours <= 11) {
            System.out.println("Morning");
        } else if (hours >= 12 && hours <= 15) {
            System.out.println("Afternoon");
        } else if (hours >= 16 && hours <= 20) {
            System.out.println("Evening");
        } else if (hours >= 21 && hours <= 24) {
            System.out.println("Night");
        } else {
            System.out.println("Invalid entry");
        }

    }
}
