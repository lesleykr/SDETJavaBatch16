package class13;

public class E3StringDemo {
    public static void main(String[] args) {
        String str="lakejr'er234cLJO94&*^&^%";
//do NOT replace a-z, replace everything else, not is donw with carrot ^
        System.out.println(str.replaceAll("[^a-z]","" ));
        //replace specific letters
        System.out.println(str.replaceAll("[Dn3]",""));
    }
}
