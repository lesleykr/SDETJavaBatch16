package class24;

import java.util.ArrayList;

public class ArrayListTask3 {
    public static void main(String[] args) {
        ArrayList<String> drinks=new ArrayList<>();
        drinks.add("coke");
        drinks.add("soda");
        drinks.add("juice");
        drinks.add("tea");

        drinks.replaceAll(x->{
            if(x.contains("a")||x.contains("e")){
                return "water";
            }else{
                return x;
            }
        });

       drinks.replaceAll(a -> a.contains("a") || a.contains("e")? "water" :a);
        System.out.println(drinks);


//contains a or e replace with water
      //  words.removeIf(x->x.endsWith("e"));

        /*
        ArrayList<String> drinks=new ArrayList<>();
        drinks.add("smoothie");
        drinks.add("ginger ale");
        drinks.add("chai");
        drinks.add("milk");
       drinks.replaceAll(a -> a.contains("a") || a.contains("e")? "water" :a);
        System.out.println(drinks);
         */

/*
        for(int i=0;i<drinks.size(); i++){
            String drink
        }
        drinks.remove(drinks.contains("e"));
        drinks.replaceAll(x->x.contains("e"));*/

    }
}
