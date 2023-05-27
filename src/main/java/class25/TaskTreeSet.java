package class25;

import java.util.TreeSet;

public class TaskTreeSet {
    public static void main(String[] args) {
        TreeSet<String> countries=new TreeSet<>();
        countries.add("USA");
        countries.add("France");
        countries.add("Russia");
        countries.add("Canada");
        countries.add("Mexico");
        countries.add("Belgium");
        countries.add("Italy");
        countries.add("Sweden");
        countries.add("Japan");
        countries.add("China");

        System.out.println(countries);

        for(String c:countries){
            System.out.println(c);
        }
    }
}
