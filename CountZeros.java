public class CountZeros {
    static void countzeroes(int num , int count){
        if(num ==0){
            System.out.println(count);
            return;
        }
        int digit = num%10;
        if(digit==0){
            count++;
        }
        countzeroes(num/10, count);
    }

    static int countzeroes(int num){
        if(num==0){
            return 0;
        }
        int digit = num%10;
        int count = countzeroes(num/10);
        if(digit==0){
            return 1+count;
        }
        else{
            return count;
        }

    }
    public static void main(String[] args) {
        //countzeroes(3005608, 0);
        int res = countzeroes(3005608);
        System.out.println(res);
    }
}
