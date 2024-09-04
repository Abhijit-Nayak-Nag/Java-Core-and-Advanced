public class User {
    private String username;
    private String email;
    private boolean isActive;
    public User(String username, String email) {
        this.username = username;
        this.email = email;
        init();
    }
    private void init() {
        // Simulate a complex initialization process
        isActive = checkActivationStatus();
    }
    private boolean checkActivationStatus() {
        // Simulated logic to determine activation status
        return true;
    }
    public void displayStatus() {
        System.out.println("Username: " + username);
        System.out.println("Email: " + email);
        System.out.println("Active: " + isActive);
    }
    public static void main(String[] args) {
        User user = new User("jdoe", "jdoe@example.com");
        user.displayStatus();
    }
}
