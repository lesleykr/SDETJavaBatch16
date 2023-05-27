package projects.project1;

public class Q3EvenOnly {
    public static void main(String[] args) {
        int[][] nums = {
                {4, 7, 3, 6, 8},
                {11, 15, 22, 9},
                {1, 20, 5}
        };
        System.out.print("Even Numbers: ");
        for (int[] grp : nums) {
            for (int num : grp) {
                if (num % 2 == 0) {
                    System.out.print(num + " ");
                }
            }
        }
    }
}
