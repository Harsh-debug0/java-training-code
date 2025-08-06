public class ArrayTraverse {
    static void arraytraverse(int[] a,int index){
        if(index==a.length){
            return;
        }
        System.out.println(a[index]);
        //index++;
        arraytraverse(a, index+1);
    }
    public static void main(String[] args) {
        int arr[] = {10,20,30,40,60,50};
        arraytraverse(arr, 0);
    }
}
