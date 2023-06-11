package review11;

import java.util.ArrayList;

public class E5ArrayList {
    public static void main(String[] args) {
        ArrayList<String> arrayList=new ArrayList();
        arrayList.add("Adam");
        arrayList.add("Sarah");
        arrayList.add("Halim");
        arrayList.add("Abdul");
        arrayList.add("Semir");
        arrayList.add("Semir");
      // arrayList.removeIf(x->x.startsWith("A"));
        System.out.println(arrayList);
       // arrayList.removeIf(x->x.length()>5);
        //remove all of the names which contains odd num of letters
       // arrayList.removeIf(x->x.length()%2!=0);
        arrayList.removeIf(x->x.contains("A")||x.length()>5);
        System.out.println(arrayList);




    }
}
