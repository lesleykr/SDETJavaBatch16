package class17;

public class Person {
    String name;

    Person(){
        System.out.println("No argument constuctor");

    }

    Person(String personName) {

        name = personName;
        System.out.println("1 argument constructor");
    }


}
