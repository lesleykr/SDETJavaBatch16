package class10.HW;

public class Countries {
    public static void main(String[] args) {
        String[][] countries = {
                {"USA", "Canada"},
                {"Mexico", "Brazil", "Chile", "Venezuala"},
                {"France", "Britain", "Spain", "Belgium"},
                {"Japan", "China","Korea","India", "Pakistan"},
                {"Ethiopia", "Chad", "Sudan"}
        };
        int sum = 0;
        for (int row = 0; row < countries.length; row++) {
            sum=sum+countries[row].length;
            for (int col = 0; col < countries[row].length; col++) {
                System.out.print(countries[row][col] + " ");

            }
            System.out.println();
        }System.out.println("Total: " + sum);

        System.out.println();

        for (String[] country : countries) {
            for (String name : country) {
                System.out.print(name + " ");

            }
        }
    }
}
