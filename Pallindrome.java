public class Pallindrome {
    // static int isPalindrome(int num){
    //     if(num==0){
    //         if(num==org){
    //             System.out.println("Pallindrome");
    //         }
    //         else{
    //             System.out.println("Not a Pallindrome");
    //         }
    //     }
    //     int reverse = num%10;
    //     isPalindrome(num/10);
    //     return reverse*10+num%10;
    // }
    static boolean isPalindrome(int num,int org,int reverse){
        if(num==0){
            if(reverse==org){
                return true;
            }
            else{
                return false;
            }
        }
        return isPalindrome(num/10, org,reverse*10+num%10);
    }
    public static void main(String[] args) {
        // boolean result = isPalindrome(818,818,0);
        // System.out.println(result?"Pallindrome":"Not");
        // isPalindrome(151);
    }
}
