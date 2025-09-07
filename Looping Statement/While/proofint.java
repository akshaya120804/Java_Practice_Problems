package zoho;

import java.util.Scanner;

public class proofint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        int pro = 1;
        int num = n;

        while (num > 0) {
            int digit = num % 10; 
            pro *= digit;         
            num /= 10;            
        }

        System.out.println("Product of digits: " + pro);
    }
}
