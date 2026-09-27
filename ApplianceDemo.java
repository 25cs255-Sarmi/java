interface RemoteControl {

    void turnOn();

    void turnOff();
}


abstract class Appliance {

    abstract void displayAppliance();
}


class SmartTV extends Appliance implements RemoteControl {

    public void turnOn() {
        System.out.println("Smart TV is turned ON");
    }

    public void turnOff() {
        System.out.println("Smart TV is turned OFF");
    }

    void displayAppliance() {
        System.out.println("Appliance: Smart TV");
        System.out.println("Status: Ready");
    }
}


public class ApplianceDemo {

    public static void main(String[] args) {

        // Parent class reference
        Appliance appliance = new SmartTV();

        // Display appliance details
        appliance.displayAppliance();

        // Interface reference
        RemoteControl remoteControl = (SmartTV) appliance;

        // Turn ON and OFF
        remoteControl.turnOn();
        remoteControl.turnOff();

        System.out.println("Appliance status displayed successfully.");
    }
}