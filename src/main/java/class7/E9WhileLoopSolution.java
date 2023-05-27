package class7;

public class E9WhileLoopSolution {
    public static void main(String[] args) {
        // print 25 20 10 5 using a while loop using if

        int counter = 25;
        while(counter>=5){
            if(counter != 15){
                System.out.println(counter + " ");
            }
            counter -=5;
        }
    }
}
