package class8;

public class E11NestedLoops {
    public static void main(String[] args) {
        for (int i = 0; i < 4; i++) {
            int j = 2;
            while (j < 11) {
                System.out.print(j + " ");
                j += 2;
            }
            System.out.println();
        }

        //OR (teacher's solution):
        int counter = 0;
        while (counter < 4) {
            for (int k = 2; k <= 10; k += 2) {
                System.out.print(k + " ");
            }
            System.out.println();
            counter++;
        }
    }
}
