package loginExcept;

import java.io.IOException;
import java.util.Scanner;

public class LoginPassword {

    String username;

    String password;


    public LoginPassword(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public void login() throws Exception1, Exception2, Exception3 {
        if (username==null || password==null||username.isEmpty()||password.isEmpty()) {
            throw new Exception1("Username/password is not entered!");
        }
        if (6 > password.length()) {
            throw new Exception2("The length of password should be more than 6 symbols!");
        }
        if (!password.equals("path123") || !username.equals("petrova")) {
            throw new Exception3("The entered username/password is not valid!");
        }
        else {
            System.out.println("Successful login!");
        }
    }

}
