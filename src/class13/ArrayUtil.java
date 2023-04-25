package class13;public class ArrayUtil {
    public static void main(String[] args) {
        int[] arr0 = {10, 20, 45, 89};
        int[] arr1 = {12, 32, 455, 889};
        int[] arr2 ={120,302,5,889};
        int number0 = 100;
        int number1 = 32;
        int number2=10;

        ArrayUtil meep=new ArrayUtil();
        meep.searchArray(arr0,10);
        meep.searchArray(arr1, number1);
                }
    void searchArray(int[] arr, int number){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == number){
                System.out.println("Yes");
            }

        }



        //old way (without methods)
       /* for (int i = 0; i < arr.length; i++) {
            if (arr[i] == number) {
                System.out.println("Number i is found");
            }
            for (int j = 0; j < arr1.length; j++) {
                if (arr[j] == number1) {
                    System.out.println("Number j is found");
                }

            }
        }*/
    }}
