import java.io.Serializable;

public class Credentials implements Serializable {
    String login;
    String password;

    Credentials(String login, String password) {
        this.login = login;
        this.password = password;
    }
}
