package class25;

import java.util.Collection;
import java.util.Set;
import java.util.TreeMap;

public class E9Maps {
    public static void main(String[] args) {
        TreeMap<String, Double>makeup=new TreeMap<>();
        makeup.put("Lipstick",100.00);
        makeup.put("BlushOn",68.00);
        makeup.put("EyeLiner",80.0);
        makeup.put("Foundation",120.0);
        makeup.put("Base",25.0);
        //get only the keys from this map
        Set<String> keys= makeup.keySet();
        System.out.println(keys);

        Collection<Double> values=makeup.values();
        System.out.println(values);

    }
}
