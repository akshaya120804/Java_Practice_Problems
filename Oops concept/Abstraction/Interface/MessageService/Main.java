package Abstraction.Interface.MessageService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Choose Messaging Platform:");
        System.out.println("1. WhatsApp");
        System.out.println("2. Telegram");
        System.out.println("3. Signal");
        int choice = sc.nextInt();
        sc.nextLine(); // consume newline

        System.out.print("Enter your message: ");
        String msg = sc.nextLine();

        MessagingService service;

        switch(choice) {
            case 1: service = new WhatsApp(); break;
            case 2: service = new Telegram(); break;
            case 3: service = new Signal(); break;
            default: System.out.println("Invalid choice!"); return;
        }

        // Abstraction in action
        service.sendMessage(msg);

        sc.close();
    }
}
