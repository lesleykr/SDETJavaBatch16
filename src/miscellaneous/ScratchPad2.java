package miscellaneous;

public class ScratchPad2 {
    public static void main(String[] args) {

        int array_variable[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

        int sum = 0;

        for (int i = 0; i < 3; ++i) {

            for (int j = 0; j < 3; ++j) {

                sum = sum + array_variable[i][j];

                // (count++ < 10) == count < 10; count + 1;
                // (++count < 10) == count + 1; count < 10;


            }

        }

        System.out.print(sum / 5);}}



