package class26;

import java.util.HashSet;
import java.util.Set;

public class EntrySetTester {
    public static void main(String[] args) {
        Set<Entry> entrySet=new HashSet<>();
        entrySet.add(new Entry("coke", 2.0));
        entrySet.add(new Entry("milk", 5.0));
        entrySet.add(new Entry("mango juice", 2.5));

        for(Entry e:entrySet){
            if(e.getKey().contains("i")&& e.getValue()>2){
            System.out.println(e.getKey()+" "+e.getValue());
        }

            //cannot use loop to remove, use removeif
            entrySet.removeIf(x->x.getKey().contains("i")&&x.getValue()>2);
            System.out.println(entrySet);
        }
    }
}
