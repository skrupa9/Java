import com.sun.security.jgss.GSSUtil;

import java.sql.SQLOutput;

public class MainApp {

    public static void main(String[] args) {

        // Operatory matematyczne
        double a = 10;
        double b = 4;
        System.out.println(10 + 10);
        System.out.println(10 - 10);
        System.out.println(10 * 10);
        System.out.println(10 / 10);
        System.out.println(a / b);

        // Operatory porównania
        int numOne = 1;
        int numTwo = 2;
        System.out.println(numOne < numTwo);
        System.out.println(numOne > numTwo);
        System.out.println(numOne == numTwo);
        System.out.println(numOne != numTwo);

        // Operatory logiczne
        System.out.println(numOne > numTwo || numOne == 1);     // || - lub
        System.out.println(numOne < numTwo && numOne != 1);     // && - i

    }
}
