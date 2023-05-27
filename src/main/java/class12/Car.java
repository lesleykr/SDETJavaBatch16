package class12;

public class Car {
    //define 5 attributes & 3 methods

    String make;
    String model;
    String color;
    boolean isAutomatic;
    int avgMPG;

    void start(){
        System.out.println("vroom, vroom....");
    }
    void stop(){
        System.out.println(model + " " + "stopped");
    }

    void turnRight(){
        System.out.println("right turn");
    }

}
