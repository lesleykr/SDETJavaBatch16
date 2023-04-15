package class7.homework;

public class OddNums {
    public static void main(String[] args) {
        //Print odd numbers between 20 and 50 (2 ways)

        //option1:
        int i = 20;
        while (i <= 50) {
            if (i % 2 == 1) {
                System.out.print(i + " ");
                i++;
            } else {
                i++;
            }
        }
        System.out.println();

        //option 2:
        for (int j = 20; j <= 50; j++) {
            if (j % 2 == 1) {
                System.out.print(j + " ");
            }
        }
    }
}
