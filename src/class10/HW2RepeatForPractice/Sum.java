package class10.HW2RepeatForPractice;

public class Sum {
    public static void main(String[] args) {
        int[][] nums = {
                {3,8,40},
                {0,9,30},
                {5,6,2}
        };

        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                sum+=nums[i][j];
            }
        }
        System.out.print(sum);
        System.out.println();

        int sum2=0;
        for(int[] grp:nums){
            for(int num:grp){
                sum2+=num;
            }
        }
        System.out.println(sum2);
    }
}
