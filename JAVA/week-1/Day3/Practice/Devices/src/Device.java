public class Device {
    private int battery;

    //!Constructors
    public Device() {
        battery = 100;
    }

    //!Getters and Setters
    public int getBattery() {
        return battery;
    }

    public void setBattery(int battery) {
        this.battery = battery;
    }

    //!Methods
    // Display battery life
    public void displayBatteryLife() {
        System.out.println("Battery life: " + battery + "%");
    }
}