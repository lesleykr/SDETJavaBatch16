package class26;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TaskTreeMap {
    public static void main(String[] args) {
        TreeMap<String,String> countries=new TreeMap<>();
        countries.put("USA","Washington DC");
        countries.put("France","Paris");
        countries.put("Italy","Rome");
        countries.put("China","Beijing");
        countries.put("UK","London");

        Set<Map.Entry<String,String>> entrySet=countries.entrySet();

        for(Map.Entry<String,String> c:entrySet){
            System.out.println(c.getKey()+" "+c.getValue());
        }
        for(Map.Entry<String,String> c:entrySet){
            System.out.println(c.getKey());
        }
        for(Map.Entry<String,String> c:entrySet){
            System.out.println(c.getValue());
        }
        //better way to do the above:
        for(String c:countries.keySet()){
            System.out.println(c);
        }

        for(String v:countries.values()){
            System.out.println(v);
        }
            //Use var to make it easier to print both keys and values
            for(var e:countries.entrySet()){
                System.out.println(e.getKey()+" "+e.getValue());
            }


    }
}
