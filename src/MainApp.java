import java.sql.SQLOutput;

public class MainApp {

    public static void main(String[] args) {

        String str1 = "Hello";
        String str2 = "hello";

        System.out.println(str1.equals(str2));
        System.out.println(str1.equalsIgnoreCase(str2));

        System.out.println(str1.toUpperCase());
        System.out.println(str1.toLowerCase());

        System.out.println(str1.startsWith("He"));
        System.out.println(str1.endsWith("llo"));

        System.out.println(str1.contains("ell"));

        System.out.println("    b  ".isBlank());    //sprawdza czy text zawiera literę, ignoruje białe znaki
        System.out.println("   ".isEmpty());    //sprawdza długość textu

        System.out.println(str1.replace("ll", "rr"));
        System.out.println(str1.replaceAll("l", "aa"));

        System.out.println(str1.substring(1, 4));

        String textWithWhiteSpaces = "    some text    ";
        System.out.println(textWithWhiteSpaces.length());

        String strip = textWithWhiteSpaces.strip();
        System.out.println(strip);
        System.out.println(strip.length());
    }
}