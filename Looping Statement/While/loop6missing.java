package sample;

import java.util.Scanner;

public class loop6missing {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int b = scan.nextInt();
        scan.close();

        boolean[] present = new boolean[10]; 

        while (b > 0) {
            int digit = b % 10;
            present[digit] = true;
            b /= 10;
        }

        // Print missing digits
        System.out.println("Missing digits:");
        for (int i = 0; i <= 9; i++) {
            if (!present[i]) {
                System.out.println(i);
            }
        }
    }
}
