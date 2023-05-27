package class25;

import java.util.ArrayList;
import java.util.HashSet;

public class E3Sets {
    public static void main(String[] args) {
        //prints each duplicate, so two results
        ArrayList<String> names=new ArrayList<>();
        names.add("Farwa");
        names.add("Farwa");
        System.out.println(names);

//Prints only one copy of the duplicate
        HashSet<String> uniqNames=new HashSet<>();
        uniqNames.add("Yellow");
        uniqNames.add("Yellow");
        uniqNames.add("green");
        //there is no get method in sets. You can't do uniqNames.get(0)
        System.out.println(uniqNames);
        //You can't use most types of loops with sets, but you can use enhances forloop
        for (String name:uniqNames){
            System.out.println(name);        }
    }
}
