import java.util.Scanner;
public class ModifiedRotateNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number:");
        int num = sc.nextInt();

        System.out.println("Enter the value of k:");
        int k = sc.nextInt();

        int temp = num;
        int digitCount = 0;
        while (temp != 0) {
            temp /= 10;
            digitCount++;
        }

        k = k % digitCount;

        int divisor = (int) Math.pow(10, k);
        int multiplier = (int) Math.pow(10, digitCount - k);

        int lastPart = num % divisor;
        int firstPart = num / divisor;

        int result = lastPart * multiplier + firstPart;

        System.out.println("Rotated Number: " + result);
        sc.close();
    }
}
