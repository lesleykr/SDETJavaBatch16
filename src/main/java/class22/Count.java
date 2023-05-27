package class22;

public class Count {
    static int count1=0;
    static int counter(int num, int[] arr){
        for(int item:arr){
            if(item==num){
                count1++;
            }
        }return count1;
    }

    public static void main(String[] args) {
        int[] arr={3,5,6,3,8,3,3,9};
        System.out.println(counter(3, arr));
    }
}
