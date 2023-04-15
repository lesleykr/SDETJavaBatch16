package class8;

public class E13NestedLoops {
    public static void main(String[] args) {
        /*
        2 2 2 2 2
        3 3 3 3 3
        4 4 4 4 4
        */
        for(int i=2 ; i<5; i++){
            for(int j =0; j<5; j++){
                System.out.print(i + " ");
            }
            System.out.println();
        }
        /*
        1 2 3 4 5
        2 3 4 5 6
        3 4 5 6 7
         */
        for(int i = 1 ; i<4 ; i++){
            for(int j = i; j<i+5 ; j++){
                System.out.print(j + " ");

            }
            System.out.println();
        }

        //OR (Teacher's solution, more flexible than mine):
        for(int j = 0; j<3; j++){
            for(int i =1; i <= 5; i++){
                System.out.print(i+j+" ");
            }
            System.out.println();
        }
    }
}
