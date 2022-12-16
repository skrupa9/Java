public class Bug {

    private String description;
    private String email;
    private int priority;
    private String status = "Open";

    Bug(String description, String email, int priority) {
        this.description = description;
        this.email = email;
        this.priority = priority;
    }

    void showAllInfo() {
        System.out.println("desctiption:\t" + description + "\n"
                + "email:\t" + email + "\n"
                + "priority:\t" + priority + "\n"
                + "status:\t" + status);
    }

    void showEmail() {
        System.out.println("email:\t" + email);
    }

    void showStatus() {
        System.out.println("status:\t" + status);
    }

    int getPriority() {
        return this.priority;
    }
}
