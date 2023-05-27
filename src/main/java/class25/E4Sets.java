package class25;

import java.util.LinkedHashSet;

public class E4Sets {
    public static void main(String[] args) {
        LinkedHashSet<String> fruit=new LinkedHashSet<>();
        fruit.add("Kiwis");
        fruit.add("Mango");
        fruit.add("Orange");
        fruit.add("Mango");
        fruit.add("Apple");
        //prints in order items were inserted. does not print duplicates.
        System.out.println(fruit);
    }
}
