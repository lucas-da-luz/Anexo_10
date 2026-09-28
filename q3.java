package Annex_10;

import java.util.Scanner;

public class arrays_q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[10];

        for ( int index = 0; index < numbers.length; index++ ) {
            System.out.printf("Enter integer %d of 10: ", index + 1);
            numbers[index] = scanner.nextInt();
        }

        System.out.println("\nArray elements:");
        for ( int index = 0; index < numbers.length; index++ ) {
            System.out.printf("%d ", numbers[index]);
        }
        System.out.println();

        int divisor;
        do {
            System.out.print("\nEnter a positive non-zero divisor: ");
            divisor = scanner.nextInt();
        } while ( divisor <= 0 );

        // Put the divisible values in another vector
        int[] divisibleNumbers = new int[numbers.length];
        int count = 0;
        // count == New index
        for ( int index = 0; index < numbers.length; index++ ) {
            if ( numbers[index] % divisor == 0 ) {
                divisibleNumbers[count] = numbers[index];
                count++;
            }
        }
        System.out.printf("%nNumbers divisible by %d: ", divisor);
        for ( int index = 0; index < count; index++ ) {
            System.out.printf("%d ", divisibleNumbers[index]);
        }
        System.out.println();
    }
}
