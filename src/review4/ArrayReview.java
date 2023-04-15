package review4;

public class ArrayReview {
    public static void main(String[] args) {
        int i=10;
        //we store elements based on indexes
        int[] arr=new int[3];
        arr[0]=10;
        arr[1]=11;
        arr[2]=12;
        //arr[3]=13; ArrayIndexOutOfBoundsException

        for(int num:arr){
            System.out.println(num);
        }
        //access also by indexes
        System.out.println(arr[1]);

        String[] planets={"Earth", "Mars", "Jupiter", "Saturn", "Neptume"};
      /*  System.out.println(planets[0]);
        System.out.println(planets[1]);
        System.out.println(planets[2]);*/

        for (int j = 0; j < planets.length ; j++) {
            System.out.println(planets[j]);

        }
        //Enhanced for loop
        for(String planet:planets){
            System.out.println(planet);
        }
    }
}
