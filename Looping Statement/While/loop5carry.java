package sample;

import java.util.Scanner;

public class loop5carry {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        scan.close();

        int carry = 0;
        int count = 0;

        while (a > 0 || b > 0) {  // Continue until both numbers are done
            int digitA = a % 10;
            int digitB = b % 10;

            int sum = digitA + digitB + carry;

            if (sum > 9) {
                carry = 1;
                count++;
            } else {
                carry = 0;
            }

            a /= 10;
            b /= 10;
        }

        System.out.println(count);
    }
}
