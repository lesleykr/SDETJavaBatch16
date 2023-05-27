package class10.HW2RepeatForPractice;

public class Cars {
    public static void main(String[] args) {
        String[][] cars={
                {"Chrysler", "Chevrolet", "Pontiac", "Dodge", "GMC"},
                {"BMW", "Audi", "Mercedes"},
                {"Kia", "Hyundai"},
                {"Ferrari", "Maserati"}
        };
        for(int i = 0; i< cars.length; i++){
            for (int j = 0; j < cars[i].length ; j++) {
                System.out.print(cars[i][j] + " ");
            }
            System.out.println();
        }

        for(String[] country:cars){
            for(String car:country){
                System.out.print(car + " ");
            }
            System.out.println();
        }
    }
}
