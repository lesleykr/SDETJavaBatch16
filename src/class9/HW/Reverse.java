package class9.HW;

public class Reverse {
    public static void main(String[] args) {
        char[] rev = {'g', 'n', 'i', 'd', 'o', 'c'};

        for (int i = rev.length-1; i >= 0; i--) {
            System.out.print(rev[i]);
        }
    }
}
