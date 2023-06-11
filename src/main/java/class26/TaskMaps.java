package class26;

import java.util.LinkedHashMap;

public class TaskMaps {
    public static void main(String[] args) {
        LinkedHashMap<Integer,String> comps=new LinkedHashMap<>();
        comps.put(1,"Google");
        comps.put(2,"Syntax");
        comps.put(3,"Microsoft");
        comps.put(4,"Apple");
        comps.put(5,"Amazon");

        System.out.println(comps.size());
        comps.replace(4,"Apple","Sony");
        comps.remove(5,"Amazon");
        System.out.println(comps);

    }
}
