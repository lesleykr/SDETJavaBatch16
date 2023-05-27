package class11;

public class E2D2Array {
    public static void main(String[] args) {
        String[][] names={
                {"Sarah","Artem", "Lean", "Semir"},
                {"Farwa", "Halima", "Alina", "Semir"}
        };
        //Print the names
        for(String[] grp:names){
            for(String name:grp){
                System.out.print(name + " ");
            }
        }
        System.out.println();
        //2nd option:
        for (int i = 0; i < names.length; i++) {
            for (int j = 0; j < names[i].length; j++) {
                System.out.print(names[i][j] + " ");
            }

        }

    }
}
