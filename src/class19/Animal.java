package class19;

public class Animal {
//Create 3 classes like dog cat horse

    public Animal(int weight, int age, String color, String breed, String sound) {
        this.weight = weight;
        this.age = age;
        this.color = color;
        this.breed = breed;
        this.sound = sound;
    }

    int weight;
int age;
String color;
String breed;
String sound;
void printInfo(){
    System.out.println("weight: "+weight+" age: "+age+" color: "+color+" breed: "+breed+" sound: "+sound);
}
}
class Dog extends Animal{

double price;
    public Dog(int weight, int age, String color, String breed, String sound,double price){
       super(weight,age,color,breed,sound);
       this.price=price;
    }
    void printInfo(){
        super.printInfo();
        System.out.println("price: "+price);
    }
}
class Cat extends Animal{
    public Cat(int weight, int age, String color, String breed, String sound){
        super(weight,age,color,breed,sound);

    }
}
class Horse extends Animal{
    public Horse(int weight, int age, String color, String breed, String sound){
        super(weight,age,color,breed,sound);

    }
}
class AnimalTester{
    public static void main(String[] args) {
        Dog dog1=new Dog(30,5,"brown","lab","woof",200);
       dog1.printInfo();

    }
}