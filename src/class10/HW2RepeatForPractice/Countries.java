package class10.HW2RepeatForPractice;

public class Countries {
    public static void main(String[] args) {
        String[][] countries={
                {"USA","Canada"},
                {"Mexico", "Brazil","Argentina","Chile","Venezuela"},
                {"France","Spain","Belgium","Luxembourg"},
                {"India","Japan","Pakistan","China"},
                {"Chad", "Ethiopia","Sudan", "Nigeria", "Ghana"}
        };

        int count = 0;

        for (int i = 0; i < countries.length; i++) {
            for (int j = 0; j < countries[i].length; j++) {
                System.out.print(countries[i][j]+" ");
            }

            count+=countries[i].length;
        }
        System.out.println();
        System.out.println("Count: " + count);
        System.out.println();

        int count2 =0;
        for(String[] continent:countries){
            for(String country:continent){
                System.out.print(country + " ");
            }
            count2+=continent.length;
        }
        System.out.println();
        System.out.println("Count2: " + count2);
    }
}
