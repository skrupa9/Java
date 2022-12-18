import computer.Laptop;
import computer.PC;

public class MainApp {

    public static void main(String[] args) {

        PC officeComputer = new PC("Office computer", "HP", 500, 128);
        Laptop gamingLaptop = new Laptop("XGames", "HP GAMES", 500, 256);

        officeComputer.switchOn();
        gamingLaptop.switchOn();
    }
}