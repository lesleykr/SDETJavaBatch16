package class7;

public class E9WhileLoop {
    public static void main(String[] args) {
        int i = 25;

        while(i >= 5){

            if(i == 20){
                System.out.println(i);
                i -= 10;
            } else {
                System.out.println(i);
                i -= 5;
            }
        }


    }
}
