public class ArrayMax {
    static int maxarr(int arr[] , int index){
        if(index== arr.length-1){
            return arr[index];
        }
        int max = maxarr(arr, index+1);
        if(max>arr[index]){
            return max;
        }
        else{
            return arr[index];
        }
    }
    static int minarr(int arr[],int index){
        if(index==arr.length-1){
            return arr[index];
        }
        int min = minarr(arr, index+1);
        if(min<arr[index]){
            return min;
        }
        else{
            return arr[index];
        }
    }
    public static void main(String[] args) {
        int arr[] ={90,-100,8,50,88,66};
        int max = maxarr(arr,0);
        System.out.println(max);
        int min = minarr(arr, 0);
        System.out.println(min);
    }
}
