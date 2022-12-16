
public class MainApp {

    public static void main(String[] args) {

        User tomek = new User();
        tomek.firstName = "Ala";
        tomek.lastName = "Kotla";
        tomek.age = 19;
        System.out.println(tomek.isUserAdult());
        tomek.greetings("Szymon");
    }
}