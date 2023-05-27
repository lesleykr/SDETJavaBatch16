package projects.project1;

public class Q9SecondLargest {
    public static void main(String[] args) {
        int[] arr = {2, 33, 61, 61, 7, 65,65, 9, 47};

        int count = 0;

        for (int num : arr) {
            count = 0;
            for (int num2 : arr) {
                if (num < num2) {
                    count++;
                }
            }
            if (count == 1) {
                System.out.println(num);
            }
        }
    }
}

