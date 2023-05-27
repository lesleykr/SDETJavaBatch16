package class18;

public class Honda extends Vehicle{
}

class BMW extends Vehicle{
void offerMPackage(){
    System.out.println("Only BMW offers M Package");
}
        }

class Audi extends Vehicle{

}
class CarTester{
    public static void main(String[] args) {
        Honda honda=new Honda();
        honda.stopCar();
    }
}