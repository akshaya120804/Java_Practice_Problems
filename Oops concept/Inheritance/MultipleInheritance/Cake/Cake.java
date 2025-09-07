package Inheritance.MultipleInheritance.Cake;

class Cake extends Dessert {
    String flavor;

    Cake(String recipeName, String ingredients, String sweetLevel, String flavor) {
        super(recipeName, ingredients, sweetLevel);
        this.flavor = flavor;
    }

    void displayCake() {
        displayDessert();
        System.out.println("Cake Flavor: " + flavor);
    }
}