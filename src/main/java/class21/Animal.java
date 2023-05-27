package class21;

public class Animal {
    String name;
    String color;
    String breed;
    public Animal(String name, String color, String breed){
        this.name=name;
        this.color=color;
        this.breed=breed;
    }
    void printInfo(){
        System.out.println(name+" "+color+" "+breed);
    }
    void speak(){
        System.out.println("Animals speak");
    }
    void sleep(){
        System.out.println("Animals sleep");
    }
    void eat(){
        System.out.println("Animals eat");
    }
}
class Dog extends Animal {
    public Dog(String name, String color, String breed) {
        super(name, color, breed);
    }
    @Override
    void speak(){
        System.out.println("woof");
    }
    @Override
    void sleep(){
        System.out.println("Dogs sleep 8 hours");
    }
    @Override
    void eat(){
        System.out.println("Dogs like to chew bones");

    }
    void run(){
        System.out.println("dog runs");
    }
}
    class Cat extends Animal {
        public Cat(String name, String color, String breed){
            super(name, color, breed);
        }
        @Override
        void speak() {
            System.out.println("Meow");
        }
        @Override
        void eat(){
            System.out.println("cats like to eat fish");
        }
        @Override
        void sleep(){
            System.out.println("cats like to sleep");
        }
}
class Horse extends Animal{
    public Horse(String name, String color, String breed){
        super(name, color, breed);
    }
    @Override
    void speak(){
        System.out.println("neigh neigh");
    }
    @Override
    void sleep(){
        System.out.println("Horses sleep 2-3 hours");
    }
    @Override
    void eat(){
        System.out.println("Horses eat carrots");
    }

}
class AnimalTester{
    public static void main(String[] args) {
        Dog dog=new Dog("Morpehous","brown","lab");
        Animal dog1=new Dog("Shaggy","black","German");
        dog1.printInfo();

        Animal[] animals={new Dog("shagy","black","German"), new Cat("Tom","Blue","persian")};;

        for(Animal animal:animals){
            animal.printInfo();
        }
    }
}