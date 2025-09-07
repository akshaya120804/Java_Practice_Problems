package Inheritance.MultipleInheritance.Cake;

class Dessert extends Recipe {
    String sweetLevel;

    Dessert(String recipeName, String ingredients, String sweetLevel) {
        super(recipeName, ingredients);
        this.sweetLevel = sweetLevel;
    }

    void displayDessert() {
        displayRecipe();
        System.out.println("Sweetness Level: " + sweetLevel);
    }
}