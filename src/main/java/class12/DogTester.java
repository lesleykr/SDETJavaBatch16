package class12;

public class DogTester {
    public static void main(String[] args) {
        Dog actualDog=new Dog();
        actualDog.name= "Jacky";
        actualDog.age=15;
        actualDog.breed="German";
        actualDog.color="Black";
        actualDog.weight=50;

        actualDog.bark();

        Dog obj=new Dog();

        Dog dog2=new Dog();
        dog2.name="spot";
        dog2.age=7;
        dog2.breed="spaniel";
        dog2.color="Brown";
        dog2.weight=20;
    }
}
