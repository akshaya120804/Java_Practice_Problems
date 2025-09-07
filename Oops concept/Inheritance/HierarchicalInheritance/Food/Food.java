package Inheritance.HierarchicalInheritance.Food;

class Food {
    String name;
    int calories;

    Food(String name, int calories) {
        this.name = name;
        this.calories = calories;
    }

    void showDetails() {
        System.out.println("Food Name: " + name);
        System.out.println("Calories: " + calories + " kcal");
    }
}