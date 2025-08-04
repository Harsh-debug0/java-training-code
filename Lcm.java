import java.util.Scanner;
public class Lcm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int big = a>b?a:b;
        while(true){
            if(big%a==0 && big %b==0){
                System.out.println("LCM OF "+a+" and "+b+" is "+big);
                break;
            }
            big++;
        }
        int hcf = a*b/big;
        System.out.println("HCF of two numbers "+a +"& "+"b"+"is "+hcf);
        sc.close();
    }
}
