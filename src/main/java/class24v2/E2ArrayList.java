package class24v2;

import java.util.ArrayList;

public class E2ArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> numbers=new ArrayList<>(20);
        numbers.add(10);
        numbers.add(20);
        numbers.add(100);
        numbers.add(200);
        System.out.println(numbers);

        for(Integer num:numbers){
            System.out.println(num);
        }
        System.out.println("******************");
        for (int i = 0; i < numbers.size(); i++) {
            System.out.println(numbers.get(i));
        }
        System.out.println("*****************************");
        int j=0;
while (j<numbers.size()){
    System.out.println(numbers.get(j));
    j++;
}
        System.out.println("________________________________");
int k=0;
 do {
     System.out.println(numbers.get(k));
     k++;

 }while(k<numbers.size());
    }
}
