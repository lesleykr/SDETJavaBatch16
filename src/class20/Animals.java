package class20;

public class Animals {
    String breed;
    String color;
    int weight;
    Animals(String breed, String color, int weight){
        this.breed=breed;
        this.color=color;
        this.weight=weight;
        System.out.println(breed+" "+color+" "+weight);
    }
    void speak(){
        System.out.println("Animal is speaking");
    }
    void run(){
            System.out.println("animal runs");
        }
        void jump(){
            System.out.println("animal jumps");
        }
    }
class Dog extends Animals {
    int age;

    Dog(String breed, String color, int weight, int age) {
        super(breed, color, weight);
        this.age = age;
    }


    void speak() {
        System.out.println("woof");
    }
}
    class Cat extends Animals {
        int livesLeft;

        Cat(String breed, String color, int weight, int livesLeft) {
            super(breed, color, weight);
            this.livesLeft = livesLeft;
        }
    }

    class Horse extends Animals {

        int shoes;

        Horse(String breed, String color, int weight, int shoes) {
            super(breed, color, weight);
            this.shoes = shoes;
        }
    }


