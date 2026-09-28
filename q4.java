package Annex_10;

import java.util.Scanner;

public class arrays_q4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5];
        
        for (int index = 0; index < numbers.length; index++) {
            System.out.printf("Enter integer %d of 5: ", index + 1);
            numbers[index] = scanner.nextInt();
        }
        System.out.println("\nOriginal array:");
        
        for (int index = 0; index < numbers.length; index++) {
            System.out.printf("%d ", numbers[index]);
        }
        System.out.println();

        for (int index = 0; index < numbers.length / 2; index++) {
            // A variable to hold the value of the final constant
            int temporary = numbers[index];
            // Subtract the current index to determine the target position,
            // and subtract 1 to align with the array index (which starts at 0).
            numbers[index] = numbers[numbers.length - 1 - index];
            // Resends the value of the initial term
            numbers[numbers.length - 1 - index] = temporary;
        }

        System.out.println("\nReversed array:");
        for (int index = 0; index < numbers.length; index++) {
            System.out.printf("%d ", numbers[index]);
        }
        System.out.println();
    }
}
