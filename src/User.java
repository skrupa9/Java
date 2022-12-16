public class User {

    String firstName;
    String lastName;
    String email;
    int age;
    boolean isAdult;


    User(String firstName, String lastName, String email, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.age = age;
        this.isAdult = isUserAdult();
    }

    void getFullName() {
        System.out.println(firstName + " " + lastName);
    }

    void getAllInfo() {
        System.out.println(firstName + " " + lastName + " " + email + " " + age + " " + isAdult);
    }

    int getUserAge() {
        return age;
    }

    boolean isUserAdult() {
        return this.age >= 18;
    }

    void greetings(String name) {
        System.out.println("Hi " + name + ". Nice to see you");
    }

    void greetingsFullName(String firstName, String lastName) {
        System.out.println("Hi " + firstName + " " + lastName + ". Nice to see you");
    }


    void howOldAreYou(String name, int age) {
        System.out.println("Hi " + name + " you are " + age + "years old");
    }

    int yourAgePlus10(int userAge) {
        return userAge + 10;
    }
}
