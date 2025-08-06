public class CountEvenOddDigitsinNum {
    static void countevenodddigits(int num,int even,int odd){
        if(num==0){
            System.out.println("Even: "+even);
            System.out.println("Odd: "+odd);
            return;
        }
        int lastdigit = num%10;
        if(lastdigit%2==0){
            even++;
        }
        else{
            odd++;
        }
        countevenodddigits(num/10, even, odd);
    }
    static int countevenodddigits1(int num){
        if(num ==0){
            return 0;
        }
        int counteven = countevenodddigits1(num/10);
        int lastdigit = num%10;
        if(lastdigit%2==0){
            counteven++;
        }
        return counteven;
    }
    public static void main(String[] args) {
        int num = 332456789;
        int even=0;
        int odd=0;
        countevenodddigits(num,even,odd);
        int res= countevenodddigits1(num);
        System.out.println(res);
    }
}
