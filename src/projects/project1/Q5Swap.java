package projects.project1;

public class Q5Swap {
    public static void main(String[] args) {
        int[] nums = {4, 6, 2, 3, 9};

        System.out.println("Swap Two Numbers:");
        int first = nums[1];
        int second = nums[3];
        System.out.println("First = " + first + " " + "Second = " + second);
        first = second + first;
        second = first - second;
        first = first - second;
        System.out.println(("First = " + first + " " + "Second = " + second));

        System.out.println("Swap Two Numbers in an Array:");

        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();
        nums[1] = nums[1] + nums[3];
        nums[3] = nums[1] - nums[3];
        nums[1] = nums[1] - nums[3];
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
