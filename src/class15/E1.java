package class15;

import java.util.Arrays;

public class E1 {
    //create a method that takes a number call it size as input and creates an array of ints with that size
    //give by that number fill the array with some numbers lets
    //say 10 and returns the array  call the method creatArray

    int[] createArray(int size1, int numChoice){

        int[] arr1=new int[size1];
        for (int i = 0; i < size1; i++) {
            arr1[i]=numChoice;
        }
return  arr1;
    }

    public static void main(String[] args) {
        E1 newOne=new E1();
        int[] array = newOne.createArray(5, 7);

        for (int num:array){
                  System.out.print(num);
        }
        System.out.println(Arrays.toString(array));
    }
}
