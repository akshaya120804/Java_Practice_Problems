package Inheritance.HierarchicalInheritance.Food;

class FastFood extends Food {
    String oilLevel;

    FastFood(String name, int calories, String oilLevel) {
        super(name, calories);
        this.oilLevel = oilLevel;
    }

    @Override
    void showDetails() {
        super.showDetails();
        System.out.println("Oil Level: " + oilLevel);
    }
}
