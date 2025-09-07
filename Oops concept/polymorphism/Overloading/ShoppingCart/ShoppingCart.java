package polymorphism.Overloading.ShoppingCart;

class ShoppingCart {
    // Overloaded methods
    public double calculateBill(double price, int qty) {
        return price * qty;
    }

    public double calculateBill(double price1, int qty1, double price2, int qty2) {
        return (price1 * qty1) + (price2 * qty2);
    }
}