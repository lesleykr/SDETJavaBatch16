package class29;

import java.util.ArrayList;
import java.util.List;

public class E7Methods {
    public static void main(String[] args) {
        E7Methods e6Methods=new E7Methods();
        List <Integer> list=new ArrayList<>();
        list.add(10);
        list.add(40);
        list.add(30);
        list.add(10);
        e6Methods.print(list);
    }
    void print(List<Integer> list){
        for (Integer item :list)
                 {
                     System.out.println(item);

        }
    }
}
