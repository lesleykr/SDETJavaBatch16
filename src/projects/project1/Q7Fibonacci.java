package projects.project1;

public class Q7Fibonacci {
    public static void main(String[] args) {

        int[] fib = new int[10];
        System.out.print("The Fibonacci Sequence: ");
        for (int i = 0; i <= fib.length-1; i++) {
            if (i == 0) {
                fib[i] = 0;
            } else if (i == 1) {
                fib[i] = 1;
            } else {
                fib[i] = ((fib[i - 2]) + (fib[i - 1]));
            }
            System.out.print(fib[i] + " ");
        }
    }
}

