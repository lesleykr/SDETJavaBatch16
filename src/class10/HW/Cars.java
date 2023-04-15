package class10.HW;

public class Cars {
    public static void main(String[] args) {
        String[][] cars = {
                {"Chevy", "Pontiac", "Chrysler", "Dodge"},
                {"BMW", "Volkswagon", "Audi"},
                {"Kia", "Hyundai"},
                {"Alfa Romeo", "Maserati", "Ferrari"}
        };

        for (int row = 0; row < cars.length; row++) {

            for (int col = 0; col < cars[row].length; col++) {
                System.out.print(cars[row][col] + " ");
            }
            System.out.println();
        }

        System.out.println();

        for (String[] car : cars) {
            for (String make : car) {
                System.out.print(make + " ");
            }

        }
    }
}

