package class21;
public class E1Poly {
    public static void main(String[] args) {

        Dog dog1=new Dog("Spot", "brown", "mutt");
        Cat cat1 = new Cat("Pixie", "gray", "Tabby");
        Horse horse1 = new Horse("Annie", "black", "Clydesdale");

       Animal[] animals = {dog1, cat1, horse1};

        for (Animal animal : animals) {
            animal.printInfo();
            animal.eat();
            animal.sleep();
            animal.speak();
        }
        //typecasting

        //type|variable | object of Dog class
        Animal animal=new Dog("Spot", "brown", "mutt");
        //the type of the variable overrides the type of the object.
        //Thus, above is of type Animal, not Dog
       //we must type cast the animal back  to a dog to call the run method
       //as this run method only exits in the Dog class.
        Dog d=(Dog)animal;
        d.run();
        int num=(int)10.5;
//Direct way without using a variable
        ((Dog)animal).run();
    }
}
// call all methods from cat, dog and horse classes