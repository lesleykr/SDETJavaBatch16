package class17;

import java.sql.SQLOutput;

public class Task1 {
    String name;
    String color;

    Task1(){
        System.out.println("single parameter");
    }

    Task1(String name){
        System.out.println("double parameter");
    }

    public static void main(String[] args) {
        Task1 task=new Task1();
        Task1 task2=new Task1("Joe");
    }
}
