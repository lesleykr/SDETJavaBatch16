package class14;

public class E6 {
    //create a method which returns true or false and takes an int
    //number as a parameter if num is
    //even it returns true otherwise it returns false

    boolean isEven(int num){
       /* boolean isTrue=false;
        if(num%2==0){
            isTrue=true;
        }return isTrue;*/
        return num%2==0;
    }

    public static void main(String[] args) {
        E6 test=new E6();
        boolean test1 = test.isEven(6);
        System.out.println(test1);
    }
}
