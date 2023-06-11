package class21v2;

class Animal{
    String name;
    String color;
    String breed;

    public Animal(String name, String color, String breed) {
        this.name = name;
        this.color = color;
        this.breed = breed;
    }

    void printInfo(){
        System.out.println(name+" "+color+" "+breed);
    }
    void speak(){
        System.out.println("Speaking");

    }
    void sleep(){
        System.out.println("sleep");
    }

    void eat(){
        System.out.println("eating");
    }
}

class Cat extends Animal{
    public Cat(String name, String color, String breed){
        super(name, color, breed);
    }
    @Override
    void speak(){
        System.out.println("Meow");
    }
    @Override
    void eat(){
        System.out.println("eating fish");
    }
    @Override
    void sleep(){
        System.out.println("cat sleeping");
    }

}
public class Dog extends Animal{

    public Dog(String name, String color, String breed) {
        super(name, color, breed);
    }
    @Override
    void speak(){
        System.out.println("woof");
    }
    @Override
    void sleep(){
        System.out.println("Dog sleeps");
    }
    @Override
    void eat(){
        System.out.println("Dog eats everything");
    }
    void run(){
        System.out.println("Dog runs");
    }
}

class Horse extends Animal{
    public Horse(String name, String color, String breed){
        super(name, color, breed);
    }
    @Override
    void speak(){
        System.out.println("Ney");
    }
    @Override
    void sleep(){
        System.out.println("Horse sleeps");
    }
    @Override
    void eat(){
        System.out.println("Horse eats hay");
    }
}

class AnimalTester{
    public static void main(String[] args) {
        Dog dog=new Dog("Shaggy","black", "German");
        dog.printInfo();
        //Parent class variables can store the objects of the child classes
        Animal dog1=new Dog("Spot","brown","Spaniel");
        dog1.printInfo();

        Animal [] animals={new Dog("Rex","white","Husky"), new Cat("Tom","Blue","Persian")};
        for(Animal animal:animals){
            animal.printInfo();
        }
    }
}