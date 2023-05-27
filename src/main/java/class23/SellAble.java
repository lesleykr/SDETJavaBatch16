package class23;

public interface SellAble {
    //private int price=12000;  private and protected access modifier not allowed
    //all vars in interface are public static final

    //final void sell(); final,private, static not allowed as methods are
    //abstract by default. Because they cannot be overriden and t
    //therefore cannot be implemented.

    static void sell(){
        System.out.println("Allowed");//static methods are allowed in interfaces, but not in abstract classes
    }
}

class Tester1{
    public static void main(String[] args){
        SellAble.sell();
    }
}