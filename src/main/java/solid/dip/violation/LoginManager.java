package solid.dip.violation;

public class LoginManager {
    // high level class
    SimpleLogin simpleLogin = new SimpleLogin();
    public void login(User user){
        simpleLogin.authenticate(user);
    }
}
