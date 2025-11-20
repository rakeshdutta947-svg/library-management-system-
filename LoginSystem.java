public class LoginSystem {
    public static boolean authenticate(String username, String password) {
        return username.equals("admin") && password.equals("1234");
    }
}
