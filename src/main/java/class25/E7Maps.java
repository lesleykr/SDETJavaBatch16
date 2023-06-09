package class25;

import java.util.HashMap;

public class E7Maps {
    public static void main(String[] args) {
        HashMap<String, Double> grocery=new HashMap<>();
        grocery.put("Apple", 2.5);
        grocery.put("Soap",3.1);
        grocery.put("Eggs",3.5);
        grocery.put("Orange",2.5);
        //if we insert data w/the same key again it will override
        grocery.put("Apple", 4.5);

        System.out.println(grocery);
        System.out.println(grocery.size());
        System.out.println(grocery.containsKey("Banana"));
        System.out.println(grocery.containsKey("Eggs"));
        System.out.println(grocery.containsValue(3.5));
        System.out.println(grocery.isEmpty());

    }
}
