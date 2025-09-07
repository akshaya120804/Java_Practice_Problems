package Inheritance.HierarchicalInheritance.Vehicle;

class Bike extends Vehicle {
    String type; // sports / normal

    Bike(String brand, int speed, String type) {
        super(brand, speed);
        this.type = type;
    }

    void showBikeDetails() {
        display();
        System.out.println("Type: Bike");
        System.out.println("Bike category: " + type);
    }
}