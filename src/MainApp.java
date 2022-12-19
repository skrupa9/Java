import computer.Computer;
import computer.PC;
import computer.Laptop;

import java.io.PipedInputStream;

public class MainApp {

    public static void main(String[] args) {

        Computer officeComputer1 = new PC("Office computer 1", "HP", 500, 128);
        Computer officeComputer2 = new PC("Office computer 2", "HP", 500, 128);
        Computer officeComputer3 = new PC("Office computer 3", "HP", 500, 128);
        Computer gamingLaptop = new Laptop("XGames", "HP Games", 500, 256, 50);
        Computer macbook = new Laptop("MB Pro", "Pro", 500, 256, 100);

        Computer[] computers = {officeComputer1, officeComputer2, officeComputer3, gamingLaptop, macbook};

        for (Computer computer : computers) {
            computer.switchOff();
        }


    }
}