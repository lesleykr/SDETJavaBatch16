package class7;

public class E11WhileLoop {
    public static void main(String[] args) {

        int i = 100;
        while (i >= 1) {
            System.out.print(i + " ");
            i--;
        }

        int a = 20;
        System.out.println();
        while (a <= 100) {
            if (a % 2 == 0) {
                System.out.print(a + " ");
            } a++;
        }
        // test
        int b = 100;
        System.out.println();
        while(b >=1){
            if(b%2!=0){
                System.out.print(b + " ");
            }b--;
        }
    }
}
