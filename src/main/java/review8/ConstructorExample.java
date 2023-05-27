package review8;
/*
1. must have same name as a class
2. no return type, not even void
 */
//if we want to create our own constructor we can create non-argument or parametrized.
public class ConstructorExample {
    ConstructorExample(){
        System.out.println("I created this constructor");
    }
    public static void main(String[] args) {
        new ConstructorExample(); //calling a constructor of ConstructorExample
    }
}
