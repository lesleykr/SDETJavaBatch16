package class10.HW;

public class Groceries {
    public static void main(String[] args) {
        String[][] groceries = {
                {"celery", "radishes", "carrots"},
                {"apples", "cherries", "bananas", "strawberries"},
                {"milk", "cheese"},
                {"candy", "cookies", "cake"}
        };

        for (int row = 0; row < groceries.length; row++) {

            for (int col = 0; col < groceries[row].length; col++) {
                System.out.print(groceries[row][col] + " ");
            }
            System.out.println();
        }

        System.out.println();

        for (String[] item : groceries) {
            for (String each : item) {
                System.out.print(each + " ");
            }
        }
    }
}
