package class25;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;

public class E6CollectionsFramework {
    public static void main(String[] args) {
        ArrayList<String> fruit=new ArrayList<>();
        fruit.add("Mango");
        fruit.add("Kiwi");
        fruit.add("Banana");
        fruit.add("Orange");

        //converting an ArrayList into a HashSet
        HashSet<String> hashSet=new HashSet<>(fruit);
        System.out.println(hashSet);

        //convert HashSet to LinkedLIst
        LinkedList<String> linkedList=new LinkedList<>(hashSet);
        System.out.println(linkedList);
    }
}
