package class13;

public class Task2 {
    public static void main(String[] args) {
        String str="dgHT23$%$^&";

        String str2=str.replaceAll("[^a-zA-Z0-9]", "");
        System.out.println(str2);
       int count=str2.length();
        System.out.println(count);


        }

    }

