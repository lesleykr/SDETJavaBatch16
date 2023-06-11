package class24v2;

import java.util.ArrayList;

public class Task2 {
    public static void main(String[] args) {
        ArrayList<String> words=new ArrayList<>(5);
        words.add("same");
        words.add("GAME");
        words.add("leak");
        words.add("cape");
        words.add("sing");

        words.removeIf(x->x.endsWith("e")||x.endsWith("E"));
        System.out.println(words);
    }
}
