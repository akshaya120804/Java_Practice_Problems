package polymorphism.Overriding.Music;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose media type (audio/video/image): ");
        String choice = sc.nextLine().toLowerCase();

        Media media; 

        switch (choice) {
            case "audio":
                media = new Audio();
                break;
            case "video":
                media = new Video();
                break;
            case "image":
                media = new Image();
                break;
            default:
                media = new Media();
                break;
        }

        media.play(); 
        sc.close();
    }
}
