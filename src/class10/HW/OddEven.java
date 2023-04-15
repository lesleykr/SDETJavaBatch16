package class10.HW;

public class OddEven {
    public static void main(String[] args) {
        int[][] numbers = {
                {2, 5, 40, 1},
                {9, 4, 3, 22},
                {30, 25, 44, 7}
        };
        for (int row = 0; row < numbers.length; row++) {

            for (int col = 0; col < numbers[row].length; col++) {
                if(numbers[row][col]%2==0) {
                    System.out.print(numbers[row][col] + " ");
                }
            }
            System.out.println();
        }
    }
}
