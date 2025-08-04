import java.util.Scanner;
public class Rotatenum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        System.out.println("Enter the value of k:");
        int k = sc.nextInt();
      
        int divisor = (int)Math.pow(10,k);
        int lastDigit = num%divisor;
        int firstDigit = num/divisor;
        int firstDigitCopy = firstDigit;
        divisor=1;
        while(firstDigitCopy!=0){
        divisor*=10;
        firstDigitCopy/=10;
    }
    int result = lastDigit*divisor + firstDigit;
    System.out.println(result);
    sc.close();
    }
}

// k = k % no of digit 
// if k is negative 
// prime number check in TC less then O(n)

