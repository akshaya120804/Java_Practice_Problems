package Inheritance.HierarchicalInheritance.Vehicle;

class Truck extends Vehicle {
    int capacity; // in tons

    Truck(String brand, int speed, int capacity) {
        super(brand, speed);
        this.capacity = capacity;
    }

    void showTruckDetails() {
        display();
        System.out.println("Type: Truck");
        System.out.println("Load capacity: " + capacity + " tons");
    }
}