package class17;

public class Car {
    String make;
    String model;
    int engineCC;
    String color;

    Car(String make, String model, int engineCC, String color) {
        make = make;
        model = model;
        engineCC = engineCC;
        color = color;
    }
    void printInfo(){
            System.out.println(make+" "+model+" "+engineCC+" "+color);
        }


    public static void main(String[] args) {
        Car car=new Car("Honda","Civic",1800,"white" );
    }
}
