package class26;

import java.util.TreeMap;

public class TaskTreeMap2 {
    public static void main(String[] args) {
        TreeMap<Integer,String> items=new TreeMap<>();
        items.put(2234,"TV");
        items.put(1345,"Printer");
        items.put(8756,"laptop");
        items.put(4567,"iPad");
        items.put(3678,"desktop");

        for(var i:items.entrySet()){
            System.out.println(i.getKey()+" "+i.getValue());
        }
    }
}
