import java.util.Scanner;
public class PositionSwap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any no.");
        int num = sc.nextInt();
        int pos =0;
        int result =0;
        while(num>0){
            int lastdigit = num%10;
            pos++;
            num = num/10;
            result += pos* (int)Math.pow(10,lastdigit-1);
        }
        System.out.println(result);
        sc.close();
    }
}
