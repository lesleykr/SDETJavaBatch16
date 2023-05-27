package class10;

public class E5D2Arrays {
    public static void main(String[] args) {
        int[][] matrix={
                {10, 20, 30, 40, 50},
                {20, 50, 65, 20},
                {102, 54, 60},
                {20, 55}
        };

        for(int row=0; row < matrix.length; row++){

            for(int col = 0; col < matrix[row].length; col++){
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }

        //Repeat for practice:
        for(int k=0; k<matrix.length; k++){

            for(int n = 0; n<matrix[k].length; n++){
                System.out.print(matrix[k][n] + " ");
            }
            System.out.println();
        }
    }
}
