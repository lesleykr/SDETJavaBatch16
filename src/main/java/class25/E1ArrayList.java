package class25;

import java.util.ArrayList;

public class E1ArrayList {
    public static void main(String[] args) {
        /*
        ArrayList=> a class(Its part of the collection's framework, in utils)
         */
        Car car1=new Car("Toyota","Prius");
        Car car2=new Car("Honda","Civic");
        Car car3=new Car("BMW","I7");
        ArrayList<Car> arrayList=new ArrayList<>();
        //creating object of car class and storing it in arrayList
        arrayList.add(car1);
        arrayList.add(car2);
        arrayList.add(car3);
        for(Car c:arrayList){
            c.printInfo();
        }
    }
}


class Car{
    String make;
    String model;
    Car(String make, String model){
        this.make=make;
        this.model=model;
    }
    void printInfo(){
        System.out.println(model+" "+make);
    }
}
