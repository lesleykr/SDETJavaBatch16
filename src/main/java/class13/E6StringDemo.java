package class13;

public class E6StringDemo {
    public static void main(String[] args) {
        //Strings are immutable, but StringBuilder is mutable.

        String str="Wife";
        str.toLowerCase();
        System.out.println(str); //does not print in lowercase, because original string did not change

        StringBuilder str2=new StringBuilder("Husband");
        str2.reverse();
        System.out.println(str2); //DOES print in reverse because the actual var changed.

    }
}
