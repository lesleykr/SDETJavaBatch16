package class24v2;

import java.util.ArrayList;

public class Task1 {
    public static void main(String[] args) {
        ArrayList<String> names=new ArrayList<>(5);
        names.add("Joe");
        names.add("Sally");
        names.add("Andy");
        names.add("Jane");
        names.add("Annie");
        System.out.println(names.isEmpty());
        System.out.println(names.contains("Jane"));
        System.out.println(names.size());

    }
}
