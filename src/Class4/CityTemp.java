package Class4;

import java.util.Scanner;

public class CityTemp {
    public static void main(String[] args) {

        Scanner askCity = new Scanner(System.in);
        System.out.println("What city do you live in?");
        String city = askCity.next();

        Scanner askTemp = new Scanner(System.in);
        System.out.println("What is the current temperature?");
        int temp = askTemp.nextInt();
        int celsius = (int)((temp - 32)/1.8);

        System.out.println("The temperature in the city of " + city + " is " + celsius);
    }
}
