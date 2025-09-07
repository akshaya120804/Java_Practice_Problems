package Inheritance.MultipleInheritance.mobile;

class WearableDevice extends SmartDevice {
    String healthFeatures;

    WearableDevice(String deviceName, String brand, String os, String healthFeatures) {
        super(deviceName, brand, os);
        this.healthFeatures = healthFeatures;
    }

    void displayWearable() {
        displaySmartDevice();
        System.out.println("Health Features: " + healthFeatures);
    }
}