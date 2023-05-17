package class22;

public class AnimalTester {
    public static void main(String[] args) {
        Dog dog1=new Dog();
        Cat cat1=new Cat();
        Horse horse1=new Horse();

        Animal[] arr={dog1,cat1,horse1};
        for(Animal animal:arr){
            animal.eat();
            animal.sleep();
            animal.speak();
        }
    }
}
