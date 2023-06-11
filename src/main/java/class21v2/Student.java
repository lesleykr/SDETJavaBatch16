package class21v2;

public class Student {
    void study(){
        System.out.println("studying");
    }
    void write(){
        System.out.println("Writing");
    }
    void read(){
        System.out.println("reading");
    }
}

class SyntaxStudent extends Student{
    @Override
    void study(){
        System.out.println("Syntax student studying");
    }
    @Override
    void write(){
        System.out.println("Syntax student writing");
    }
    @Override
    void read(){
        System.out.println("Syntax Student reading");
    }
    void coding(){
        System.out.println("Coding");
    }

}
class CollegeStudent extends Student{
    @Override
    void study(){
        System.out.println("College student studying");
    }
    @Override
    void write(){
        System.out.println("College student writing");
    }
    @Override
    void read(){
        System.out.println("College Student reading");
    }
    void partying(){
        System.out.println("partying");
    }
}
class SchoolStudent extends Student{
    @Override
    void study(){
        System.out.println("School student studying");
    }
    @Override
    void write(){
        System.out.println("School student writing");
    }
    @Override
    void read(){
        System.out.println("School Student reading");
    }
    void ridingBus(){
        System.out.println("riding bus");
    }
}
