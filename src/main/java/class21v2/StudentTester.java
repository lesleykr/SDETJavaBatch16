package class21v2;

public class StudentTester {
    public static void main(String[] args) {
        Student syntax=new SyntaxStudent();
        Student college=new CollegeStudent();
        Student school=new SchoolStudent();

        Student[] students={syntax,college,school};

        for(Student student:students){
            student.read();
            student.write();
            student.study();
        }
        Student syntax2=new SyntaxStudent();
      SyntaxStudent syntaxNew=(SyntaxStudent) syntax2;
      syntaxNew.coding();
      Student college2=new CollegeStudent();
        ((CollegeStudent) college2).partying();

        Student[] students2={new CollegeStudent(), new SyntaxStudent(), new SchoolStudent()};

        for(Student student:students2){
            if(student instanceof SyntaxStudent){
                ((SyntaxStudent)student).coding();
            }else if(student instanceof SchoolStudent){
                ((SchoolStudent) student).ridingBus();
            }
            student.read();
            student.study();
            student.write();
        }

        Student syntax3=new SchoolStudent();
        if(syntax instanceof SyntaxStudent){
            ((SyntaxStudent)syntax).coding();
        }else{
            System.out.println("Type casting is not possible");
        }

        Animal animal=new Cat("Tom","Blue","Persia");
        if(animal instanceof Cat){
            System.out.println("Yep");
        }else{
            System.out.println("nope");
        }

    }
}
