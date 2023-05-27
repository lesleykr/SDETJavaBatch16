package class2;

import java.sql.SQLOutput;
public class Variables {

    public static void main(String[] args) {

        String fName = "John";
        String lName = "Doe";
        String grade = "B";
        String city = "Cincinnati";
        String state = "Ohio";
        String phoneNum = "513-962-7845";

        System.out.println("My name is " + fName + " " + lName);
        System.out.println("I am a " + grade + " student");
        System.out.println("I live in " + city + ", " + state);
        System.out.println("And my phone number is " + phoneNum);

        grade = "A";
        city = "Philadelphia";
        state = "Pennsylvania";
        phoneNum = "718-954-8751";

        System.out.println("\nMy name is " + fName + " " + lName);
        System.out.println("And I moved to " + city + ", " + state);
        System.out.println("I am now an " + grade + " student");
        System.out.println("My new phone number is " + phoneNum);
    }
}