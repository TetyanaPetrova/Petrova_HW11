package loginExcept;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your Username: ");
        String username = in.nextLine();
        System.out.print("Enter your Password: ");
        String password = in.nextLine();
        LoginPassword newLogin = new LoginPassword(username, password);
        try {
            newLogin.login();
        } catch (Exception1 | Exception2 | Exception3 e) {
            System.out.println(e.getMessage());
        }

    }
}