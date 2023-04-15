package class8;

public class E14NestedLoops {
    public static void main(String[] args) {
        /*
        1 1
        1 2
        1 3
        2 1
        2 2
        2 3
        */

        /*for(int grpCount = 1; grpCount<3 ; grpCount++){
            for(int rowCount = 0; rowCount<3; rowCount++) {
                for(int colCount = 1;colCount<2; colCount++){
                    System.out.print(grpCount + " " +(colCount+rowCount));
                }
                System.out.println();
                }
            }*/

        for (int first = 1; first < 3; first++) {
            for (int second = 1; second < 4; second++) {
                System.out.println(first + " " + second);

            }
        }

    }
}



