package class21;

public class Refresher1 {
    public static void main(String[] args) {

        Dog[] dogs={new Dog("lal","black","Persian"), new Dog("papi","white","chinese")};
        Dog d=dogs[0];

        for(int i=0;i< dogs.length;i++){
            dogs[i].printInfo();
        }

        for(Dog dog:dogs){
            dog.printInfo();
        }
    }
}
