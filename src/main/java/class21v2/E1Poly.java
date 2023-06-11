package class21v2;

public class E1Poly {
    public static void main(String[] args) {
        Animal cat=new Cat("Dorian","gray","Tabby");
        Animal dog=new Dog("Spot","white","shepherd");
        Animal horse=new Horse("Cinnamon","brown","Clydesdale");

        cat.eat();
        cat.sleep();
        cat.speak();
        cat.printInfo();

        dog.speak();
        dog.sleep();
        dog.eat();
        dog.printInfo();

        horse.speak();
        horse.eat();
        horse.sleep();
        horse.printInfo();

        System.out.println("-----------------------------------");

        Animal[] animals={cat,dog,horse};
        for(Animal animal:animals){
            animal.eat();
            animal.sleep();
            animal.speak();
            animal.printInfo();
        }

        Animal[] animals1={new Dog("Kantoor","black","German"), new Cat("Pesho","Grey","Italian"),
        new Horse("Kal","Black","Turkish")};

        for (Animal animal:animals1){
            animal.speak();
            animal.eat();
            animal.sleep();
        }
Animal dogStoredInAnimal=new Dog("Kantoor","Black","German");

        //we must typecast the animal back to a dog to call the run method
        //as this run method only exists in the Dog class
        Dog d=(Dog)dogStoredInAnimal;
        d.run();
       int num=(int) 10.5;
    }
}
