package Inheritance.MultipleInheritance.mobile;

class Device {
    String deviceName, brand;

    Device(String deviceName, String brand) {
        this.deviceName = deviceName;
        this.brand = brand;
    }

    void displayDevice() {
        System.out.println("Device Name : " + deviceName);
        System.out.println("Brand : " + brand);
    }
}