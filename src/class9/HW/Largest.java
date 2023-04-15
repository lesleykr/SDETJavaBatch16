package class9.HW;

public class Largest {
    public static void main(String[] args) {
        int[] arr = {4, 77,863,39,2043,6};
        int max = arr[0];

        for (int i = 1; i < arr.length ; i++) {
                if(arr[i] > max){
                    max=arr[i];
                }
            }
        System.out.println(max);
        }
    }

