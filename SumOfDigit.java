public class SumOfDigit {
    static int sumOfDigit(int num){
        if(num==0){
            int sum =0;
            return sum;
        }
        int sum = (sumOfDigit(num/10));
        sum += num;
        return sum;
    }

   static void sumOfDigit1(int num,int sum){
    if(num==0){
        System.out.println(sum);
        return;
    }
    int digit = num%10;
    sum += digit;
    sumOfDigit1(num/10, sum);
   }
    public static void main(String[] args) {
        // int res = sumOfDigit(123);
        // System.out.println(res);
        sumOfDigit1(123,0);
    }
}
