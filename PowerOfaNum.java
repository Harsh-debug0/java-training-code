public class PowerOfaNum {
    static void powerofnum(int base,int exp,int result){
        if(exp==0){
            System.out.println(result);
            return;
        }
        powerofnum(base, exp-1, result*base);
    }
    static int powerofnum1(int base,int exp){
        if(exp==0){
            return 1;
        }
        int res = powerofnum1(base, exp-1);
        res = res*base;
        return res;
    }
    public static void main(String[] args) {
        int base =2;
        int exp =5;
        int result = 1;
        powerofnum(base, exp, result);
        int res = powerofnum1(base, exp);
        System.out.println(res);
    }
}
