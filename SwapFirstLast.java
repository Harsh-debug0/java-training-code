import java.util.Scanner;

public class SwapFirstLast{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number");
        int num = sc.nextInt();
        
        int lastdigit = num%10;
        int temp = num;
        int div =1;
        while(temp>10){
            temp = temp/10;
            div = div*10;
        }

        int middle = (num%div)/10;
        int swapped = lastdigit*div + middle*10 +temp;
        System.out.println("Number before swapping is: "+num);
        System.out.println("Number after swapping is: "+swapped);

        sc.close();
    }
}