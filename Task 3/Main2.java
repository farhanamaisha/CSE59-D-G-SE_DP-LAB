public class Main2 {

    
    static class User {
        private String username;
        private String email;

        public User(String username, String email) {
            this.username = username;
            this.email = email;
        }

        public String getUsername() {
            return username;
        }

        public String getEmail() {
            return email;
        }
    }

    
    static class EmailValidator {
        public static boolean isValid(String email) {
            if (email != null && email.contains("@")) {
                return true;
            }

            System.out.println("Invalid email format.");
            return false;
        }
    }

    
    static class UserRepository {
        public void save(User user) {
            if (EmailValidator.isValid(user.getEmail())) {
                System.out.println("Connecting to database...");
                System.out.println(
                    "Saving user " + user.getUsername() + " to the users table."
                );
            }
        }
    }

    
    public static void main(String[] args) {

        User user = new User("John", "john@example.com");

        UserRepository repository = new UserRepository();
        repository.save(user);
    }
}
