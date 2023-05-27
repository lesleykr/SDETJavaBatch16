package class22;

public class FindNum {
    static int foundNum=0;
   static int arrNum(int numFind, int[] arr){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==numFind){
               foundNum=i;
            }
        } return foundNum;
    }

    public static void main(String[] args) {
        int[] arr={55,6,3,9,33};
        System.out.println(arrNum(3,arr));
    }
}
