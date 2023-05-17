package class22;

public class Average {
 static int avg=0;
    static int avgArr(int[] arr) {
        for (int num : arr) {
            avg += num;
        }
        return avg / arr.length;

    }
    public static void main(String[] args) {
       int[] arr1={2,3,5,6};
        System.out.println(avgArr(arr1));
    }
}
