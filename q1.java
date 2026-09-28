import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int higher = Integer.MIN_VALUE;
        Scanner scan = new Scanner(System.in);

        int numbers[] = new int[8];
        for ( int numbers_index = 0; numbers_index < numbers.length; numbers_index++ ) {
            System.out.printf("Enter the number for the list: ");
            numbers[numbers_index] = scan.nextInt();

            if ( numbers[numbers_index] > higher) {
                higher = numbers_index;
            }

        }
        System.out.printf("The higher number it's in the position %d", higher);

    }
}
