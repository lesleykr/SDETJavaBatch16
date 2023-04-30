package class14;

public class Tester {
    public static void main(String[] args) {
        E5ArrayUtils find=new E5ArrayUtils();
        int[] arr={10,20,45};
        boolean found=find.contains(arr,10);
        System.out.println(found);
    }
}
