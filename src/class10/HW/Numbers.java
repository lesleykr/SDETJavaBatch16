package class10.HW;

public class Numbers {
    public static void main(String[] args) {
        int[][] numbers={
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        int sum = 0;
        for (int row = 0; row < numbers.length; row++) {

            for (int col = 0; col < numbers[row].length; col++) {
                sum=sum+numbers[row][col];
            }

        }System.out.println(sum);
    }
}
