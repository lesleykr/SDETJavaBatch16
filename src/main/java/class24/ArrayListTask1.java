package class24;

import java.util.ArrayList;

public class ArrayListTask1 {
    public static void main(String[] args) {

    ArrayList<String> names=new ArrayList<>();
    names.add("Jane");
    names.add("Joe");
    names.add("Sally");
    names.add("Steve");
    names.add("Dan");

        System.out.println(names.isEmpty());

        System.out.println(names.contains("Sally"));

        System.out.println(names.size());

        System.out.println(names);

        System.out.println("_________________________");

        for(String name:names){
            System.out.println(name);
        }

    }
}
