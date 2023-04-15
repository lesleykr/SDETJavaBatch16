package review4;

public class MoreNestedLoops {
    public static void main(String[] args) {
        for (int i = 1; i <3 ; i++) {
            for (int j = 0; j <3 ; j++) {
                System.out.println("Hello");
                break;
            }
            System.out.println("bye");
        }
        System.out.println("------------------");
        /////////////
        for (int i = 1; i <3 ; i++) {
            for (int j = 0; j <3 ; j++) {
                System.out.println("Hello");
                break;
            }
            System.out.println("bye");
            break;
        }
        System.out.println("------------------");
        ////////
        for (int i = 1; i <3 ; i++) {
            for (int j = 0; j <3 ; j++) {
                if(j==2){
                    continue;
                }
                System.out.println("Hello");

            }
            System.out.println("bye");
        }
        System.out.println("-----------------------------");

        for (int i = 1; i <3 ; i++) {
            for (int j = 0; j <3 ; j++) {
                if(i==2){
                    continue;
                }
                System.out.println("Hello");
            }
            System.out.println("bye");
        }
    }
}
