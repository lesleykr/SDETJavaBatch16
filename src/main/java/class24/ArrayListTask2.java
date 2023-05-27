package class24;

import java.util.ArrayList;

public class ArrayListTask2 {
    public static void main(String[] args) {
        ArrayList<String> words=new ArrayList<>();

        words.add("take");
        words.add("sing");
        words.add("apple");
        words.add("apples");
        words.add("kitty");

        /*for(String word:words){   //This does not work w/array list
            if(word.endsWith("e")){
                words.remove(word);
            }
        }   System.out.println(words);*/
/*
        for(int i =0 ; i <words.size(); i++){  //will only work with i-- at end, not the best plan
            String word=words.get(i);
            if(word.endsWith("e")){
                words.remove(i);
                i--;
            }
        }*/
        System.out.println(words);

        words.removeIf(word->(word.endsWith("e")));  //lambda expression
        //Shorter version:
        words.removeIf(x->x.endsWith("e"));
        System.out.println(words);

    }
}
