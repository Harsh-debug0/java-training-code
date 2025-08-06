public class ArrayElementSum {
    static int dosum(int[] arr,int index){
        if(index==arr.length-1){
            return arr[index];
        }
        int sum = dosum(arr, index+1);
        sum += arr[index];
        return sum;
    }

    static void dosum1(int[] arr,int index, int sum){
        if(index==arr.length){
            System.out.println(sum);
            return;
        }
        sum += arr[index];
        dosum1(arr, index+1, sum);
    }
    public static void main(String[] args) {
        int arr[] = {10,20,30,40,50};
        int sum = dosum(arr, 0);
        System.out.println(sum);
        dosum1(arr, 0, 0);
    }
}
