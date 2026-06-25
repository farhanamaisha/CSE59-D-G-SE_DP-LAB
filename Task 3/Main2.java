
public class User {
    private String username;
    private String email;
    public User(String username,String email){
        this.username=username;
        this.email=email;
    }
    public String getusername(){
        return username;
    }
    public String getemail(){
        return email;
    }
}
public class EmailValidator {
    public static boolean isvalid(String email){
        if(email!=null && email.contains("@")){
            return true;
        
        }
        System.out.println("invalid email format");
        return false;
    }
    
}
public class UserRepository {
    public void save(User user){
        if(EmailValidator.isvalid(user.getemail())){
            System.out.println("connecting database");
            System.out.println("saving user"+ user.getusername()+ "to the user table");
        }
    }
}

public class Main2 {
    public static void main(String[] args) {
        User user =new User ("john doe","a@exm.com");
        UserRepository rep=new  UserRepository();
        rep.save(user);
    }
}
