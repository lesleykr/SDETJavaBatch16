package review10;

public class FacebookUser {
   private String name;
    private String userName;
    private String password;
    private String dob;
    public FacebookUser(String Name, String userName, String password, String dob){
        if(this.userName.equals(userName)&&this.password.equals(password)){
            System.out.println("Logged in");
        }
    }
}
