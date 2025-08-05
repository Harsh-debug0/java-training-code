public class Pallindrome {
    // static int rev =0;
    // static int isPalindrome(int num){
    //     if(num==0){
    //         return rev;
    //     }
    //     rev= rev*10+num%10;
    //     return isPalindrome(num/10);   
    // }

    static int ispallindrome(int num){
        return ispallindrome(num, 0);
    }

    static int ispallindrome(int num,int rev){
        if(num==0){
            return rev;
        }
        return ispallindrome(num, rev*10+num%10);
    }

    static boolean isPalindrome(int num,int org,int reverse){
        if(num==0){
            if(reverse==org){
                return true;
            }
            else{
                return false;
            }
        }
        int digit = num%10;
        reverse = reverse*10+digit;
        return isPalindrome(num/10, org,reverse*10+num%10);
    }
    public static void main(String[] args) {
        // boolean result = isPalindrome(818,818,0);
        // System.out.println(result?"Pallindrome":"Not");
    //    System.out.println(ispalindrome(151));
    }
}
