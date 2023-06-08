package AgeFibonacciFizzReverse4;
import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        int reversedNumber = reverseNumber(number);
        System.out.println("Reversed number: " + reversedNumber);
    }

    public static int reverseNumber(int number) {
        StringBuilder stringBuilder = new StringBuilder(Integer.toString(number));
        stringBuilder.reverse();
        return Integer.parseInt(stringBuilder.toString());
    }
}