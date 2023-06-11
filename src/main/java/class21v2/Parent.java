package class21v2;

public class Parent {
    final int noOfMonthsInYear=12;
   final void getMarry(){
        System.out.println("Marry Shakira");
    }

    void study(){
        System.out.println("Study medicine");
    }
}

class Axel extends Parent{
@Override
    void study(){
    System.out.println("No, I want to study SDET");
}
}
