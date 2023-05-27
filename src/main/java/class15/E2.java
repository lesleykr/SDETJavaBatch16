package class15;

public class E2 {
   /* void method1(){
        System.out.println("Hello World");
    }*/

    int sumArr(int[] arr){
        int sum=0;
        for (int num:arr){
            sum+=num;
        }
        return sum;

    }
    public static void main(String[] args) {
       /* E2 greet=new E2();
            greet.method1();*/

            E2 sum1=new E2();
            int total=sum1.sumArr(new int[]{4,3,1});
        System.out.println(total);
    }
}
