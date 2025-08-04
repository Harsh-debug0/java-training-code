import java.util.Scanner;
public class Automorphic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        int square = n*n;
        int temp = n;
        int div =1;
        while(temp>0){
            temp /=10;
            div = div*10;
        }
        int lastdigit = square%div;
        if(n==lastdigit){
            System.out.println("Give number "+ n +" is a automorphic number");
        }
        else{
            System.out.println("Give number "+ n +" is not a automorphic number");
        }
        sc.close();
    }
}
