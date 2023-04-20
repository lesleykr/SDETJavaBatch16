package projects.project1;

public class Q4EvenOdd {
    public static void main(String[] args) {
        int[][] nums = {
                {4, 7, 3, 6, 16},
                {11, 15, 28, 9},
                {1, 32, 5}
        };
        int sumEven = 0;
        int sumOdd = 0;

        for (int[] grp : nums) {

            for (int num : grp) {

                if (num % 2 == 0) {
                    sumEven += num;
                } else {
                    sumOdd += num;
                }
            }
        }
        System.out.println("Sum of Even Numbers: " + sumEven);
        System.out.println("Sum of Odd Numbers: " + sumOdd);
        System.out.println("Summ of All Numbers: " + (sumEven + sumOdd));
    }
}
