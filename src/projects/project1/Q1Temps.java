package projects.project1;

public class Q1Temps {
    public static void main(String[] args) {
        int[] temps = {45, 32, 53, 61, 57, 49, 66};

        int high = temps[0];
        int low = temps[0];

        for (int temp : temps) {
            if (temp > high) {
                high = temp;
            } else if (temp < low) {
                low = temp;
            }
        }
        System.out.println("High Temperature: " + high);
        System.out.println("Low Temperature: " + low);
    }
}
