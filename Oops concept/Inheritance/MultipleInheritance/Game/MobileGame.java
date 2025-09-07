package Inheritance.MultipleInheritance.Game;

import java.util.Scanner;

class MobileGame extends VideoGame {
    int appSize;

    void inputMobileGameDetails(Scanner sc) {
        inputVideoGameDetails(sc);
        System.out.print("Enter App Size (in MB): ");
        appSize = sc.nextInt();
        sc.nextLine(); 
    }

    void displayMobileGame() {
        displayVideoGame();
        System.out.println("App Size: " + appSize + " MB");
    }
}