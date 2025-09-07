package Inheritance.MultipleInheritance.Game;

import java.util.Scanner;

class VideoGame extends Game {
    String platform;

    void inputVideoGameDetails(Scanner sc) {
        inputGameDetails(sc);
        System.out.print("Enter Platform (PC/Console): ");
        platform = sc.nextLine();
    }

    void displayVideoGame() {
        displayGame();
        System.out.println("Platform: " + platform);
    }
}