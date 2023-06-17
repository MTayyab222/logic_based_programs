import java.util.Scanner;

public class chat_gpt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int negativeSum = 0;
        int positiveEvenSum = 0;
        int positiveOddSum = 0;

        System.out.print("Enter a number (enter 0 to terminate): ");
        int number = scanner.nextInt();

        while (number != 0) {
            if (number < 0) {
                negativeSum += number;
            } else if (number % 2 == 0) {
                positiveEvenSum += number;
            } else {
                positiveOddSum += number;
            }

            System.out.print("Enter a number (enter 0 to terminate): ");
            number = scanner.nextInt();
        }

        // No need to explicitly close the Scanner

        System.out.println("Sum of negative numbers: " + negativeSum);
        System.out.println("Sum of positive even numbers: " + positiveEvenSum);
        System.out.println("Sum of positive odd numbers: " + positiveOddSum);
    }
}
