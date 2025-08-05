public class CountEveNOddRec {
    static void countevenodd(int num,int even,int odd){
        if(num==0){
            System.out.println("Even count "+even);
            System.out.println("Odd count "+odd);
            return;
        }
        if(num%2==0){
            even++;
        }
        else{
            odd++;
        }
        countevenodd(num-1,even, odd);
    }

    static int[] countevenodd(int num){
        if(num==0){
            int arr[] = new int[2];
            return arr;
        }
        
        int arr[]= countevenodd(num-1);
        if(num%2==0){
            arr[0]++;
        }
        else{
            arr[1]++;
        }
        return arr;
    }
    public static void main(String[] args) {
        //countevenodd(100, 0, 0);
        int arr[] = countevenodd(5);
        System.out.println("Even count "+ arr[0]+" odd count "+arr[1]);
    }
}
