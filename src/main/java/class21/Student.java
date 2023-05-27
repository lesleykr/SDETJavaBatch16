package class21;

public class Student {
    void study() {
        System.out.println("Studying");
    }
    void takeNotes(){
            System.out.println("Taking notes");
        }
    void read(){
            System.out.println("Reading");
        }
    }

class SyntaxStudent extends Student{
    @Override
     void study(){
        System.out.println("Studying Java");
    }
    void refactoring() {
        System.out.println("refactoring code");
    }
}
class CollegeStudent extends Student{
   @Override
    void study() {
        System.out.println("Studying college course");
    }
    void partying(){
        System.out.println("At a frat party");
    }
}
class SchoolStudent extends Student{
   @Override
    void study(){
        System.out.println("studying a subject");
    }
    void prom() {
        System.out.println("At the prom");
    }
    }
class StudentTester{

    public static void main(String[] args) {

        SyntaxStudent stu1=new SyntaxStudent();
        CollegeStudent stu2=new CollegeStudent();
        SchoolStudent stu3=new SchoolStudent();
        Student stu4=new CollegeStudent();

        Student[] students = {stu1, stu2, stu3, stu4};
        for (Student student : students) {
            student.study();
            student.takeNotes();
            student.read();
        }
        stu1.refactoring();
        stu2.partying();
        stu3.prom();

        Student stu5=new CollegeStudent();
        ((CollegeStudent)stu5).study();

        if(stu5 instanceof SyntaxStudent){
            ((SyntaxStudent)stu5).refactoring();
        }else{
            System.out.println("not typecasted");
        }



        Animal animal=new Cat("Tom","White","persian");
        if(animal instanceof Cat){
            System.out.println("Yes");
        }

        if(animal instanceof Dog){
            System.out.println("Yes");
        }
    }
}


