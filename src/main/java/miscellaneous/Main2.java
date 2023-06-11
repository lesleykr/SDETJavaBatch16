package miscellaneous;

import java.util.*;

class Main2 {
    public static void main(String[] args){

        Object item;
        Object price;
        Object quantity;
        Double subtotal;
        Double totalPurchase=0.0;

        List<Map<String, Object>> dataList=new ArrayList<>();

        Map<String,Object> appleMap=new LinkedHashMap<String,Object>();
        appleMap.put("Items","Apple");
        appleMap.put("Price", 20.00);
        appleMap.put("Quantity", 10);

       // var test=appleMap.get("Items");

        dataList.add(appleMap);
        Map<String,Object> orangeMap=new LinkedHashMap<String, Object>();
        orangeMap.put("Items","Orange");
        orangeMap.put("Price",21.99);
        orangeMap.put("Quantity",10);

        dataList.add(orangeMap);

        for(int i=0; i<dataList.size(); i++){
          /*  Set<Map.Entry<String,Object>> dataSet=dataList.get(i).entrySet();
            //List<String> keyList = new ArrayList<String>();
            for(Map.Entry<String,Object> d:dataSet){
            }*/
          item=dataList.get(i).get("Items");
          price=dataList.get(i).get("Price");
          quantity=dataList.get(i).get("Quantity");
          //  System.out.println(item+" "+price+" "+quantity);
            Double priceD=new Double(price.toString());
            Double quantityD=new Double(quantity.toString());
            subtotal=priceD*quantityD;
            totalPurchase+=subtotal;
            System.out.println("Items: "+item+" Price: "+priceD+" Quantity: "+quantityD+" Subtotal: "+subtotal);
        }
        System.out.println("Your Purchase total : "+totalPurchase);
    }

}
