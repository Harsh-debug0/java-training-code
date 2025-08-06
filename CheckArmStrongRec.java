public class CheckArmStrongRec {
    static void checkArmstrong(int num, int org, int sum) {
        if (num == 0) {
            if (sum == org) {
                System.out.println("It is an Armstrong number");
            } else {
                System.out.println( "It is not an Armstrong number");
            }
            return;
        }

        int digit = num % 10;
        sum += digit * digit * digit;
        checkArmstrong(num / 10, org, sum);
    }

    static boolean checkArmstrong1(int num, int org, int sum) {
        if (num == 0) {
            return sum == org;
        }

        int digit = num % 10;
        sum += digit * digit * digit;
        return checkArmstrong1(num / 10, org, sum);
    }

    public static void main(String[] args) {
        checkArmstrong(153,153,0);
        checkArmstrong1(153, 153, 0);
    }
}
