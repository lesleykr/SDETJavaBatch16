package class18;

public class Car {
    String make;
    String model;
    String color;
    int year;
    int engineCC;

    Car(String make, String model, String color){
        this.make=make;
        this.model=model;
        this.color=color;
    }

    //reuse the above constructor in this constructor
    Car(String make, String model, String color, int year){
        this(make, model, color);
        this.year=year;
    }

    void startCar(){
        System.out.println("starting");
    }

    void stopCar(){
        System.out.println("Stopping");
    }
}
