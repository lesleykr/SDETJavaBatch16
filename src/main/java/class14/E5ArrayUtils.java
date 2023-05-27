package class14;

public class E5ArrayUtils {
    /*
    crate a method call it contains it should take an array of integers and an
    int number in the method body it should search the array for that number if number
    is present in the array method should return tru otherwise method
    should return falase and in a seperate calss call the method and test it for below
    input {10,20,45} number 20
     */

    boolean contains(int[] arr, int num){
        boolean bool=false;
        for(int item:arr){
            if(item==num){
                bool=true;
            }
        }return bool;
    }


}


