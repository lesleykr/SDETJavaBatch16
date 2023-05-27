package class25;

import java.util.LinkedHashSet;

public class TaskCities {
    public static void main(String[] args) {
        LinkedHashSet<String> cities=new LinkedHashSet<>();
        cities.add("Cincinnati");
        cities.add("New York");
        cities.add("Paris");
        cities.add("Rome");
        cities.add("Atlanta");
        cities.add("Amsterdam");

        System.out.println(cities);
    /*   for(String c:cities){
           if(c.startsWith("A")){
               cities.remove(c);
           } System.out.println(cities);
       }*/

    }
}
