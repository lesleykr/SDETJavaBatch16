package class25;

import java.util.TreeSet;

public class E5Sets {
    public static void main(String[] args) {

        TreeSet<String> fruit=new TreeSet<>();
        fruit.add("Mango");
        fruit.add("Apple");
        fruit.add("Orange");
        fruit.add("Kiwi");
        fruit.add("Banana");
        fruit.add("Banana");
        //Treeset sorts the items, in this case they are sorted alphabetically. No duplicates are printed.
        System.out.println(fruit);

        fruit.add("2");
        fruit.add("3");
        fruit.add("6");
        fruit.add("9");
        fruit.add("8");
        fruit.add("8");
        System.out.println(fruit);

    }
}
