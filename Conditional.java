import java.util.Scanner;

public class Conditional {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first no.");
        int a = sc.nextInt();
        System.out.println("Enter second no");
        int b = sc.nextInt();
        System.out.println("Enter third no.");
        int c = sc.nextInt();
        if(a>b){
            if(a>c){
                System.out.println("greatest no is"+a);
            }
            else{
                System.out.println("greatest no. is"+c);
            }
        }
        else{
            if(c<b){
                System.out.println("greatest no is"+b);
            }
            else{
                System.out.println("greatest no is"+c);
            }
        }
        sc.close();
    }
}

