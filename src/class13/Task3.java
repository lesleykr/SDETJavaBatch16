package class13;

public class Task3 {
    public static void main(String[] args) {
        String str="Is it saturday? Is it raining? Do we have Java Class today?";

        String[] strNew=str.split("[?]");
        System.out.println(strNew.length);

    }
}
