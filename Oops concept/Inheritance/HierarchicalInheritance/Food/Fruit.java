package Inheritance.HierarchicalInheritance.Food;

class Fruit extends Food {
    String vitamin;

    Fruit(String name, int calories, String vitamin) {
        super(name, calories);
        this.vitamin = vitamin;
    }

    @Override
    void showDetails() {
        super.showDetails();
        System.out.println("Rich in Vitamin: " + vitamin);
    }
}