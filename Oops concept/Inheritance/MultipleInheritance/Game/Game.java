package Inheritance.MultipleInheritance.Game;

import java.util.Scanner;

class Game {
    String gameName, genre;

    void inputGameDetails(Scanner sc) {
        System.out.print("Enter Game Name: ");
        gameName = sc.nextLine();
        System.out.print("Enter Game Genre: ");
        genre = sc.nextLine();
    }
    void displayGame() {
        System.out.println("Game Name: " + gameName);
        System.out.println("Genre: " + genre);
    }
}