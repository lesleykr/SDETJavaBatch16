package class24;

import java.util.ArrayList;
/*
create an arrayList of even numbers from 1 to 500.
Remove any number that is divisible by 5 from that arrayList.
 */
public class ArrayListTask4 {
    public static void main(String[] args) {
        ArrayList<Integer> nums=new ArrayList<>();

        for(int i= 2 ; i<500; i=i+2){
            nums.add(i);
        }
         nums.removeIf(x->x%5==0);
        System.out.println(nums);
    }
}
