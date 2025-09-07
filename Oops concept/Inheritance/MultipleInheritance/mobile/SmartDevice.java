package Inheritance.MultipleInheritance.mobile;

class SmartDevice extends Device {
    String os;

    SmartDevice(String deviceName, String brand, String os) {
        super(deviceName, brand);
        this.os = os;
    }

    void displaySmartDevice() {
        displayDevice();
        System.out.println("Operating System: " + os);
    }
}