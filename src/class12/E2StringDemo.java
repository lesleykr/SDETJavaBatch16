package class12;

public class E2StringDemo {
    public static void main(String[] args) {

        String userName="admin";
        String password="passs";

        if(userName.length()<8 && password.length()<8){
            System.out.println("signup successful");
        } else {
            System.out.println("UserName and password can't be more than 8 characters");
        }
    }
}
