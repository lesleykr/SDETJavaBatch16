package class18;

import java.awt.*;

public class Furniture {
    String color="Black";
}

class Chair extends Furniture{
    String color="White";

    void printColor(){
        String color="Blue";
        System.out.println(color);  //"Blue" will print
        System.out.println(this.color);  //"White" will print
        System.out.println(super.color);  //"Black" will print
    }
}

class FurnitureTester{
    public static void main(String[] args) {
        Chair chair=new Chair();
        chair.printColor();
    }
}
