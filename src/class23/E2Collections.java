package class23;

import java.util.ArrayList;

public class E2Collections {
    public static void main(String[] args) {
        ArrayList<String> names=new ArrayList<>();;
        names.add("Pavel");
        names.add("Ramil");
        names.add("Vlad");
        names.add("Masoud");
        names.add("Axel");
        names.add("Zak");
        System.out.println(names);
        System.out.println(names.size());
        System.out.println(names.contains("Sarah"));
        System.out.println(names.get(0));
        names. remove("Vlad");

    }
}
