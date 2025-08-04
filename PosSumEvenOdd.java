import java.util.Scanner;

public class PosSumEvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number: ");
        int num = sc.nextInt();
        int oddSum = 0;
        int evenSum = 0;
        int position = 1; 
        while (num > 0) {
            int digit = num % 10;
            if (position % 2 == 1) {
                oddSum += digit;
            } else {
                evenSum += digit;
            }
            num = num / 10;
            position++;
        }
        System.out.println("Sum of digits at Odd Positions: " + oddSum);
        System.out.println("Sum of digits at Even Positions: " + evenSum);
        sc.close();
    }
}
