package class9;

public class E6Arrays {
    public static void main(String[] args) {
        int[] nums = {10,50,60,45,100};

        for(int i = 0; i<nums.length; i++) {
            if(i%2!=0){
                System.out.println(nums[i]);
            }
        }
    }
}
