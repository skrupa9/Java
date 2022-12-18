package model;

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

    public void setDescription(String description) {
        if (description.length() >= 10) {
            this.description = description;
        } else {
            System.out.println("Description is to short!");
        }
    }

    public String getDescription() {
        return description;
    }

    public void setEmail(String email) {
        if (email.contains("@")) {
            this.email = email;
        } else {
            System.out.println("Incorrect email!");
        }
    }

    public String getEmail() {
        return email;
    }

    public void setPriority(int priority) {
        if (priority < 0 || priority > 5) {
            System.out.println("Priority can only take value 0-5!");
        } else {
            this.priority = priority;
        }
    }

    public int getPriority() {
        return priority;
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


}
