package class24v2;

import java.util.ArrayList;

public class Task3 {
    public static void main(String[] args) {
        ArrayList<String> drinks=new ArrayList<>(5);
        drinks.add("Juice");
        drinks.add("coffee");
        drinks.add("tea");
        drinks.add("soda");
        drinks.add("water");



                for(String drink:drinks){
                    drinks.removeIf(x->x.contains("a")||x.contains("e"));
                }
    }
}
