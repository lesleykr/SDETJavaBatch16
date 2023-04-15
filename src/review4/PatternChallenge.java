package review4;

public class PatternChallenge {
    public static void main(String[] args) {
        for (int j = 0; j <= 7; j++) {
        for (int i = 1; i <=(7-j) ; i++) {
            System.out.print(i + " ");
        }
           if(j<7){
               System.out.println();
           }
        }
        for (int j = 0; j < 7; j++) {
            for (int i = 1; i <=(1+j) ; i++) {
                System.out.print(i + " " );
            }
            System.out.println();
        }
    }
}
