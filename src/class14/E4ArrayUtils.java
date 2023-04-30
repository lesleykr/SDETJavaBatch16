package class14;

public class E4ArrayUtils {
    /*
    create a method to add two int numbers and it should return the results
    back when called name of the method should be add
     */
int add(int num1, int num2){
        int sum=num1+num2;
        return sum;
    }

    public static void main(String[] args) {
        E4ArrayUtils obj = new E4ArrayUtils();
        /*
        we are calling the add method on obj object passing two arguments
        one is 10 other is 20 and storing the results from the method call into the sum
        variable.
         */
        int total=obj.add(10,20);
        System.out.println(total);
    }
}
