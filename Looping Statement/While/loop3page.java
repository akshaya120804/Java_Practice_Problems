package sample;

import java.util.Scanner;

public class loop3page {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); // Read the total number of digits available
        scanner.close();
        
        int totalDigitsUsed = 0;
        int currentPage = 0;
        int digitsPerPage = 1;
        int pageStart = 1;

        while (totalDigitsUsed < n) {
            int pageEnd = pageStart * 10 - 1;
            int pagesInRange = pageEnd - pageStart + 1;

            if (totalDigitsUsed + pagesInRange * digitsPerPage >= n) {
                int remainingDigits = n - totalDigitsUsed;
                int additionalPages = remainingDigits / digitsPerPage;
                
                if (remainingDigits % digitsPerPage == 0) {
                    System.out.println(currentPage + additionalPages);
                } else {
                    System.out.println("Impossible!");
                }
                return;
            }

            totalDigitsUsed += pagesInRange * digitsPerPage;
            currentPage += pagesInRange;
            pageStart *= 10;
            digitsPerPage++;
        }
        
        System.out.println("Impossible!");
	    }
	}
