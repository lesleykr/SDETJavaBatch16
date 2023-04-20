package class11;

import javax.swing.*;

public class E6D2Array {
    public static void main(String[] args) {
        int[][] arr= {{10, 20, 30, 40, 50},
                {1, 2, 3, 4, 5},
                {5, 5, 5, 5, 5},
                {10, 8, 6, 4, 2}
        };
        //with the help of loop you have to add all the elements for each row and print their sum
        
        int sum=0;
        for(int[] row:arr ){
            sum=0;
            for(int num:row){
                sum+=num;
            }
            System.out.println("sum = " + sum);
                
        }
    }
}
