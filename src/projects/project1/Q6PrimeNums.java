package projects.project1;

public class Q6PrimeNums {
    public static void main(String[] args) {
        int[] nums = {2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25};

        int count = 0;
        System.out.print("Prime Numbers: ");

        for (int i = 0; i < nums.length; i++) {
            count = 0;
            for (int j = 2; j < nums[i]; j++) {

                if (nums[i] % j == 0) {
                    count++;
                }
            }
            if (count == 0 || nums[i] == 2) {
                System.out.print(nums[i] + " ");
            }
        }

    }
}




