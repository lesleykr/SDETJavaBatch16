package class9.HW;

public class Sum {
    public static void main(String[] args) {
        int[] arr = {4, 77,863,39,2043,6};

        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum=sum+ arr[i];
        }  System.out.println(sum);

        //Instructor solution (Enhanced For Loop):
        int sum2=0;

        for(int item:arr){
            sum2=sum2+item;
        }
        System.out.println(sum2);
    }
}
