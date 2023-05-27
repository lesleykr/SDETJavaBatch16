package class13;

public class E5StringVsStringBuilder {
    public static void main(String[] args) {
        StringBuilder str=new StringBuilder("Java");
        System.out.println(str.reverse());

        //convert a string to a stringbuilder
        String str1="Computer";
        StringBuilder str2=new StringBuilder(str1);
        System.out.println(str2);
        //Reverse a string by converting to SB and converting back to String.
        str2.reverse();
        str1=str2.toString();
        System.out.println(str1);

    }
}
