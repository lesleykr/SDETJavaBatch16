package class18;

public class A{
    int size;

    }


class B extends A{

}

class C extends B{

}

class D extends C {
    static void printF() {
        System.out.println("I am A");
    }
}
class E extends D {

}

class ABCTest {
    public static void main(String[] args) {

E.printF();
    }
}

