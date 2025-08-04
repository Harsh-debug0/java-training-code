import java.util.Scanner;

public class PetersonNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number");
        int num = sc.nextInt();
        int original = num;
        int sum = 0;
        while (num > 0) {
            int digit = num % 10;
            int fact = 1;
            for (int i = 1; i <= digit; i++) {
                fact = fact*i;
            }
            sum += fact;
            num = num/10;
        }
        if (sum == original) {
            System.out.println("Yes it is");
        } else {
            System.out.println("No it is not");
        }
        sc.close();
    }
}
