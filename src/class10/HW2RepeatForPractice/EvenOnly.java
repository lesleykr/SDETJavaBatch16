package class10.HW2RepeatForPractice;

public class EvenOnly {
    public static void main(String[] args) {
        int[][] nums = {
                {1,4,7},
                {22,31,17},
                {8,43,21},
                {16,13,40}
        };

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                if(nums[i][j]%2==0){
                    System.out.print(nums[i][j] + " ");
                }
            }
        }
        System.out.println();
        for(int[] grp:nums){
            for(int num:grp){
                if(num%2==0){
                    System.out.print(num + " ");
                }
            }
        }
    }
}
