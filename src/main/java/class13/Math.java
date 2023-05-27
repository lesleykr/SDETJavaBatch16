package class13;

public class Math {
    void add(int num1, int num2){
        System.out.println(num1+num2);
    }
    //Defining a method
    void multiply(int num1, int num2){
        System.out.println(num1*num2);
    }

    public static void main(String[] args) {
        //creating the object of Math class calling it math
        Math math=new Math();
        //calling the method add and passing two values
        math.add(10,12);

        math.multiply(3,2);
    }
}
