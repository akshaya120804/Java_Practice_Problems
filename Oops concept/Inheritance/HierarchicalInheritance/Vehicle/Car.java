package Inheritance.HierarchicalInheritance.Vehicle;

class Car extends Vehicle {
    int doors;

    Car(String brand, int speed, int doors) {
        super(brand, speed);
        this.doors = doors;
    }

    void showCarDetails() {
        display();
        System.out.println("Type: Car");
        System.out.println("Number of doors: " + doors);
    }
}

