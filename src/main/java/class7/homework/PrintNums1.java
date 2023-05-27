package class7.homework;

public class PrintNums1 {
    public static void main(String[] args) {
//Print numbers from 1 to 100 in 1 line with space

        //option 1:
        int i = 1;
        while (i <= 100) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println();

        //option 2:
        for (int a = 1; a <= 100; a++) {
            System.out.print(a + " ");
        }
    }
}
