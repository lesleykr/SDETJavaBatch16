package class12;

public class E10StringDemo {
    public static void main(String[] args) {
        String name="LEANDROR";
        System.out.println(name.charAt(1));

        int counter=0;

        for (int i = 0; i < name.length(); i++) {
            if(name.charAt(i)=='R'){
                counter++;
            }
            System.out.println(counter);

        }

    }
}
