package class14;

public class E2ArrayManipulator {
    /* create a method that will take an int array call it SumArr
    and reutrn the sum of all the elements from that array create
    the onject of the class and call the method.
     */

    /*
    return type int
    name of the method=> sumArr
    parameters => (int [] arr)
    body=>
    {
    go through all the elements of the array add them and return the results
    }
     */
    int SumArr(int [] arr){
        int sum=0;
        for(int item:arr){
            sum+=item;
        }
        return sum;

    }

    public static void main(String[] args) {
        E2ArrayManipulator arr1=new E2ArrayManipulator();
                //arr1.SumArr(new int[]{1, 2, 3});
        int [] array={10,20,30};
        int result = arr1.SumArr(array);
        System.out.println(result);
    }
}
