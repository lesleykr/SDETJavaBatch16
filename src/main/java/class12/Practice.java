package class12;

public class Practice {
    public static void main(String[] args) {
        String username="admin";
        String password="pass123";
        String passwordConfirm="pass123";

        if(username.isEmpty()|| password.isEmpty()){
            System.out.println("Username or Password cannot be empty");
        } else if(password.length()<8){
            System.out.println("Password is too short");
        }else if(password.contains(username)){
            System.out.println("Password cannot contain username");
        } else if(!password.equals(passwordConfirm)){
            System.out.println("Passwords do not match");
        }else{
            System.out.println("You username and password have been created");
        }

    }
}
