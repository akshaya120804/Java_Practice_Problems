package Inheritance.MultipleInheritance.Cake;

class Recipe {
    String recipeName, ingredients;

    Recipe(String recipeName, String ingredients) {
        this.recipeName = recipeName;
        this.ingredients = ingredients;
    }

    void displayRecipe() {
        System.out.println("Recipe: " + recipeName);
        System.out.println("Ingredients: " + ingredients);
    }
}