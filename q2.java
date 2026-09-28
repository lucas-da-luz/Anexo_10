package Annex_10;

import java.util.Scanner;
public class arrays_q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;

        int[] numbers = new int[10];
        for (int index = 0; index < numbers.length; index++) {
            // Numbers.lenght prevents for overpass the array limit

            System.out.printf("Enter integer %d of 10: ", index + 1);
            numbers[index] = scanner.nextInt();
            sum += numbers[index];
        }

        System.out.printf("%nThe sum of all values in the array is: %d%n", sum);
    }
}
