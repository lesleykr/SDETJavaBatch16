package class29;

public class E4Methods {
    public static void main(String[] args) {
        E4Methods test=new E4Methods();
        //test.printHello();
        test.printWord("meep");
        test.printWordNum("Dorian",4);
    }

    void printHello(){
        System.out.println("Hello World");
    }

    void printWord(String word){
        System.out.println(word);
        printHello();  //You can call one method inside of another, but you cannot create a method inside of a method
    }

    void printWordNum(String word, int N) {
        for (int i = 0; i < N; i++) {
            System.out.println(word);
        }
    }
}
