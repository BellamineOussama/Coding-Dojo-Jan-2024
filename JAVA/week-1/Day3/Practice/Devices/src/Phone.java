
public class Phone extends Device {


    //!methods
    // Make a call
    public void makeCall() {
        int battery = getBattery();
        battery -= 5;
        setBattery(battery);
        System.out.println("Making a call. Remaining battery: " + battery + "%");
    }

    // Play a game
    public void playGame() {
        int battery = getBattery();
        battery -= 20;
        setBattery(battery);
        System.out.println("Playing a game. Remaining battery: " + battery + "%");
    }

    // Charge the phone
    public void charge() {
        int battery = getBattery();
        battery += 50;
        setBattery(battery);
        System.out.println("Charging. Battery now at: " + battery + "%");
    }
}