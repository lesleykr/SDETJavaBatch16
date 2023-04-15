package class7.homework;

public class EvenNums {
    public static void main(String[] args) {
//Print even numbers from 20 to 1 (2 ways)

        //option 1:
        int i = 20;
        while (i >= 1) {
            System.out.print(i + " ");
            i -= 2;
        }
        System.out.println();

        //option 2:
        for (int a = 20; a >= 1; a -= 2) {
            System.out.print(a + " ");
        }
    }
}

