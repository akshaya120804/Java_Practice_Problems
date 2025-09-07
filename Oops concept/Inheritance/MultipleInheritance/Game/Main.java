package Inheritance.MultipleInheritance.Game;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MobileGame mg = new MobileGame();
        mg.inputMobileGameDetails(sc);
        System.out.println("\nMobile Game Details:");
        mg.displayMobileGame();
        sc.close();
    }
}
