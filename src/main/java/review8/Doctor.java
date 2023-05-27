package review8;

public class Doctor {
    String firstName, lastName;
    String specialty;
    int yearsOfExperience;
    double salary;
    static boolean degree; //static (class) variable
    Doctor(String firstName, String lastName){
        this.firstName=firstName;
        this.lastName=lastName;
    }
}
