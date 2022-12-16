
public class MainApp {

    public static void main(String[] args) {

        User bartek = new User("Bartek", "Testowy", "test@test.pl", 25);
        User tomek = new User("Tomek", "Brown", "tomek@brown.pl", 17);

        bartek.getAllInfo();
        tomek.getAllInfo();
    }
}