package class29;

public class E10Methods {
    public static void main(String[] args) {
        /*
        create a method that will take an array of ints and
        will return the sume of the elements of the array. Methoda
        should be accessible throughout th
        project and method should be callable ny just writing the name of
        the class
         */

        int[] arr1={1,2,3,5};
        System.out.println(res(arr1));
    }

    public static int res(int[] arr){
        int sum=0;
        for(int a:arr){
           sum+=a;
        }return sum;
    }
}
