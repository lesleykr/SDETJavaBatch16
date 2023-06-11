package miscellaneous;

import java.util.List;
import java.util.Map;
import java.util.*;
import java.util.Set;

class Main {
    public static void main(String[] args){
        //var totalPurchase = 0.0;
       // var subTotal = 0.0;
        Object item;
        Object price;
        Object quantity;

        List<Map<String, Object>> dataList=new ArrayList<>();

        Map<String,Object> appleMap=new LinkedHashMap<String,Object>();
        appleMap.put("Items","Apple");
        appleMap.put("Price", 20.00);
        appleMap.put("Quantity", 10);

        var test=appleMap.get("Items");

        dataList.add(appleMap);
        Map<String,Object> orangeMap=new LinkedHashMap<String, Object>();
        orangeMap.put("Items","Orange");
        orangeMap.put("Price",21.99);
        orangeMap.put("Quantity",10);

        dataList.add(orangeMap);

        for(int i=0; i<dataList.size(); i++){
            Set<Map.Entry<String,Object>> dataSet=dataList.get(i).entrySet();
            //List<String> keyList = new ArrayList<String>();
            for(Map.Entry<String,Object> d:dataSet){
               // var tempKey = d.getKey();
                //var price=d.getKey().contains("Price");
                //var quantity=d.getKey().contains("Quantity");
                //keyList.add(tempKey);

                //System.out.println(d.getKey()+" "+d.getValue());
                //System.out.println(item+" "+price+" "+quantity);
            }
           // var itemName = dataSet.get
            System.out.println();

        }

    }

}
