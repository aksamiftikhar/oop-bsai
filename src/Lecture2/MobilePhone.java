package Lecture2;

public class MobilePhone {

    private int batteryPercentage;
    private int signalStrength;

    // Public methods
     void makeCall() {
        System.out.println("Calling...");
        // ... other logic
    }

     void sendMessage() {
        System.out.println("Sending message...");
        // ... other logic
    }

    // Getter for batteryPercentage
    public int getBatteryPercentage() {
        return batteryPercentage;
    }

    // Setter for batteryPercentage
    public void chargePhone(int chargeAmount) {
        // This setter method ensures battery doesn't exceed 100% or fall below 0%
        this.batteryPercentage = Math.min(100, this.batteryPercentage + chargeAmount);
        this.batteryPercentage = Math.max(0, this.batteryPercentage);
    }

    // Getter for signalStrength
    public int getSignalStrength() {
        return signalStrength;
    }

    // ... Other methods, getters, and setters

}
