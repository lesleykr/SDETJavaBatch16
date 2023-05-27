package projects.project1;

public class Q10Duplicates {
    public static void main(String[] args) {
        String[] arr = {"cat", "dog", "hamster", "dog", "fish", "dog", "fish", "guinea pig"};
        System.out.print("Duplicate Elements: ");
        int count = 0;
        for (String item : arr) {
            count = 0;
            for (String item2 : arr) {
                if (item.equals(item2)) {
                    count++;
                }
            }
            if (count > 1) {
                System.out.print(item + " ");
            }
        }
    }
}
