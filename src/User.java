public class User {

    String firstName;
    String lastName;
    String email;
    int age;
    boolean isAdult;

    void getFullMain() {
        System.out.println(firstName + " " + lastName);
    }

    void getAllInfo() {
        System.out.println(firstName + " " + lastName + " " + email + " " + age + " " + isAdult);
    }

    int getUserAge() {
        return age;
    }

    boolean isUserAdult() {
        return age >= 18;
    }

    void greetings(String name) {
        System.out.println("Hi " + name + ". Nice to see you");
    }

}
