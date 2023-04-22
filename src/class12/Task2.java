package class12;

public class Task2 {
    public static void main(String[] args) {
        String name = "Today is Saturday";
        System.out.println(name.indexOf('i'));
        System.out.println(name.indexOf('a'));
        /*    System.out.println(name.indexOf('a', 4);*/
        //print all the indexes wherever the letter a is appearing

        for (int i = 0; i < name.length(); i++) {
            if (name.charAt(i) == 'a') {
                System.out.println(name.charAt(i));
            }
        }
    }
}
