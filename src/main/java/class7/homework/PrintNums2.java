package class7.homework;

public class PrintNums2 {
    public static void main(String[] args) {
        //Print numbers from 100 to 1

        //option 1:
        int i = 100;
        while (i >= 1) {
            System.out.print(i + " ");
            i--;
        }
        System.out.println();

        //option 2:
        for (int a = 100; a >= 1; a--) {
            System.out.print(a + " ");
        }
    }
}
