package class25;

import java.util.*;

public class TaskArrayList {
    public static void main(String[] args) {
        List<String> aList=new ArrayList<>();
        aList.add("John");
        aList.add("Jane");
        aList.add("Jasmine");
        aList.add("Jane");
        aList.add("James");

        System.out.println(aList);
        LinkedList<String> linkedList=new LinkedList<>(aList);
        System.out.println(linkedList);

        LinkedHashSet<String> hashNames=new LinkedHashSet<>(aList);
        System.out.println(hashNames);
    }
}
