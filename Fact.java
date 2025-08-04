public class Fact {
    static int factofnum(int num){
        if(num==1){
            return 1;
        }
        int sres = factofnum(num-1);
        return num*sres;
    }
    static void fact(int num,int result){
        if(num==1){
            System.out.println("Factorial is "+result);
            return;
        }
        fact(num-1, result*num);
    }
    public static void main(String[] args) {
        //fact(6,1);
        int res= factofnum(6);
        System.out.println(res);
    }
}
