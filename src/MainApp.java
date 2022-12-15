import com.sun.security.jgss.GSSUtil;

import java.sql.SQLOutput;

public class MainApp {

    public static void main(String[] args) {

        int numOne = 3;
        int numTwo = 2;

        if (numOne < numTwo) {
            System.out.println("number one is less than number two");
        } else if (numOne > numTwo) {
            System.out.println("number one is greater than number two");
        } else {
            System.out.println("number one is equal number two");
        }

        String homePage = "Home";
        String loginPage = "Login";
        String contactPage = "Contact";

        String page = "Hosme";

        switch (page) {
            case "Home":
                System.out.println("Home Page");
                break;
            case "Login":
                System.out.println("Login Page");
                break;
            case "Contact":
                System.out.println("Contact Page");
                break;
            default:
                System.out.println("404 Page not found");
        }

    }
}
