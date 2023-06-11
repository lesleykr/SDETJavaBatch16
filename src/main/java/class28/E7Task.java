package class28;

import java.util.InputMismatchException;
import java.util.Scanner;

public class E7Task {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            scanner.nextInt();
        }catch(InputMismatchException e){
            System.out.println("Needs to be numeric");
        }
        }
    }

