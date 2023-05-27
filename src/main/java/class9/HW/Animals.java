package class9.HW;

public class Animals {
    public static void main(String[] args) {
        String[] animals = {"cat", "dog", "hamster", "horse", "cow"};

        for(String animal:animals){
            System.out.print(animal + " ");
        }

        System.out.println();

        for (int i = 0; i < animals.length; i++) {
            System.out.print(animals[i] + " ");
        }
    }
}
