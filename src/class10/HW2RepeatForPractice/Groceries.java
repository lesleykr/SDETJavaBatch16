package class10.HW2RepeatForPractice;

public class Groceries {
    public static void main(String[] args) {
        String[][] groceries={
                {"carrots", "celery", "radishes","cucumbers","peppers"},
                {"apples", "banana", "orange", "pears"},
                {"cheese", "milk"},
                {"candy", "cookies", "cake"}
        };
        for (int i = 0; i < groceries.length; i++) {
            for (int j = 0; j < groceries[i].length; j++) {
                System.out.print(groceries[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        for(String[] dept:groceries){
            for(String item:dept){
                System.out.print(item + " ");
            }
            System.out.println();
        }
    }
}
