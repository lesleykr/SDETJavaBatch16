package review6;

public class IceCream
{
    StringMethods flavor, color, brand;
    boolean dairyFree;
    double price;

    void eat(){
        System.out.println("We can eat " + flavor+" ice cream");
    }

    void buy(){
        System.out.println(flavor+" ice cream costs "+ price);
    }
}
