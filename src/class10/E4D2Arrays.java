package class10;

public class E4D2Arrays {
    public static void main(String[] args) {
        int[][] matrix={
                {10, 20, 30},
                {20, 50, 65},
                {102, 4, 60}
        };
        for(int j = 0; j<matrix.length; j++){
            //getting the complete oneD array from 2D array
        int[] arr1=matrix[j];

        for(int i =0; i < arr1.length; i++){
            //going over all the elements from the oneD array
            System.out.print(arr1[i] + " ");
        }
        //to print all rows on new line
            System.out.println();


//Repeat for practice:
        }
        for (int k = 0; k < matrix.length ; k++){
            int[] inner=matrix[k];
            for(int n = 0; n<inner.length; n++){
                System.out.print(inner[n]+" ");
            }
            System.out.println();
        }
    }
}
