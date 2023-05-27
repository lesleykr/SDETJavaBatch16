package class11;

public class E7D2Array {
    public static void main(String[] args) {
        boolean [][] arr2D={
                {true,false,true,true,false},
                {true,false,false,false,false}
        };
        //with the help of loops count how many times we have true in above 2D array
        int count=0;
        for(boolean[] grp:arr2D){
            for(boolean value:grp) {
                if (value) {
                    count++;
                }
            }
        } System.out.println("count = " + count);
    }
}
