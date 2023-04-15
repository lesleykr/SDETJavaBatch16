package class9;

public class E4Arrays {;

    public static void main(String[] args) {
        String[] names = {"James", "Kim", "Sue", "Jane", "Annie"};

        for(int i=0; i<names.length; i++){
            System.out.print(names[i] + " ");
        }
        int counter=0;
        while(counter<names.length){
            System.out.println(names[counter] + " ");
            counter++;
        }
    }
}
