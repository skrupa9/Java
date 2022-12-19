package computer;

public class PC extends Computer{

    private boolean isPlugged;

    public PC(String name, String type, int hdd, int ram) {
        super(name, type, hdd, ram);
    }

    public PC(String name, String type, int hdd, int ram, boolean isPlugged) {
        super(name, type, hdd, ram);
        this.isPlugged = isPlugged;
    }

    public void showComputerName() {
        System.out.println(name);
    }

    @Override
    public void switchOn() {
        System.out.println("Checking power supply");
        if (isPlugged) {
            super.switchOn();
        } else {
            System.out.println("PC is not plugged!");
        }
    }
}
