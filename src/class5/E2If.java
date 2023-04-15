package class5;

import java.util.Scanner;

public class E2If {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("is it time for break tru/false");
        boolean isBreak = input.nextBoolean();
        if(isBreak){
            System.out.println("Lets have a break");
        }
    }
}
