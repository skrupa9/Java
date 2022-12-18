package computer;

public class Laptop extends Computer{


    public Laptop(String name, String type, int hdd, int ram) {
        super(name, type, hdd, ram);
    }

    @Override
    public void switchOn(){
        System.out.println("Checking battery level");
        super.switchOn();
    }
}
