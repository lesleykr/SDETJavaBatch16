package class10.HW2RepeatForPractice;

public class Grades {
    public static void main(String[] args) {
        String[][] students={
                {"Angie", "Laura", "Joe", "Kevin", "Craig"},
                {"C","B", "A", "C", "A"}
        };

        for(int i = 0; i<students.length; i++){
            for(int j = 0; j<students[i].length; j++){
                if(students[i][j].equals("A") || students[i][j].equals("B")){
                    System.out.print(students[0][j] + " ");
                }
            }
        }
    }
}
