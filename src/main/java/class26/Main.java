package class26;
import java. util.HashMap;
class Main {
    public static void main(String[] args){
        HashMap<String, String> address=new HashMap<>();
        address.put("Street", "Patrick ST");
        address.put("Suite","265");
        address.put("City","Vienna");
        address.put("Zip","22180");
        address.put("Country","United State");

        System.out.println(address.size());
        for(var e:address.entrySet()){
            address.remove(e.getKey(),e.getValue());
        }
        System.out.println(address.size());

    }
}