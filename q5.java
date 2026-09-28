import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int odd = 0, pair = 1;
        Scanner scan = new Scanner(System.in);

        int numbers[] = new int[10];
        for ( int numbers_index = 0; numbers_index < numbers.length; numbers_index++ ) {

            System.out.printf("Enter the number for the list: ");
            numbers[numbers_index] = scan.nextInt();

            if ( numbers[numbers_index] % 2 == 0 ) {
                pair = numbers[numbers_index] * pair;
            } else {
                odd = numbers[numbers_index] + odd;
            }

        }
        System.out.printf("Pair numbers multiplication: %d \nOdd numbers sum: %d", pair, odd);
    }
}
