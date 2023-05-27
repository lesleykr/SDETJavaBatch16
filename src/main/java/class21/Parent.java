package class21;

public class Parent {
    final void getMarry(){
        System.out.println("Marry Shakira");
    }
    void study(){
        System.out.println("Study medicine");
    }
}

class Axel extends Parent{
   /*Won't work because parent method is final'
    void getMarry(){
        System.out.println("Marry girlfriend");
    }*/
    //will work because parent method is not final
    void study(){
        System.out.println("No I want SDET");
    }

}
