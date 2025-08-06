public class SumOfNaturalNo {
    static void sumNatural(int n, int sum) {
        if (n == 0) {
            System.out.println("Sum of natural numbers: " + sum);
            return;
        }

        sumNatural(n - 1, sum + n);
    }

    static int sumNatural1(int num){
        if(num==0){
            return 0;
        }
        int sum = num + sumNatural1(num-1);
        return sum;
    }
    public static void main(String[] args) {
        sumNatural(5, 0);
        int res = sumNatural1(5);
        System.out.println(res);
    }
}
