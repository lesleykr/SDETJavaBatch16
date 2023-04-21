package projects.project1;

public class Q8MaxMin {
    public static void main(String[] args) {
        int[] arr = {2, 33, 54, 7, 9};

        int min = arr[0];
        int max = arr[0];

        for (int num : arr) {
            if (num < min) {
                min = num;
            } else if (num > max) {
                max = num;
            }
        }
        System.out.println("Min: " + min + " " + "Max: " + max);
    }
}
