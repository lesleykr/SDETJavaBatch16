package class12;

public class E8StringDemo {
    public static void main(String[] args) {
        String sentence="   Java is very very easy";
        System.out.println(sentence.startsWith("Java"));
        sentence=sentence.trim().toLowerCase();
        System.out.println(sentence);

    }
}
