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

        //Instructor Solution (Enhanced For Loop):
        int largest =arr[0];
        for(int num:arr){
            if(num>largest) {
                largest = num;
            }
        }
        System.out.println(largest);
        }
    }

