import java.util.Arrays;

public class SearchElementArray {
    static int[] helper(int arr[],int index,int value,int count){
        if(index==arr.length){
            int res[] = new int[count];
            return res;
        }
        if(arr[index]==value){
            count++;
        }
        int result[] = helper(arr, index+1, value,count);
        if(arr[index]==value){
            result[count-1] = index;
        }
        return result;
    }
    static int[] searchoccurencepos(int arr[],int index,int value){
        return helper(arr, index, value,0);
    }
    static int searchelement(int arr[],int index,int value){
        if(index==arr.length){
            return -1;
        }
        if(arr[index]==value){
            return index;
        }
        return searchelement(arr, index+1, value);
    }

    static int searchoccurences(int arr[],int index,int value){
        if(index == arr.length){
            return 0;
        }
        int count = searchoccurences(arr, index+1, value);
        if(value == arr[index]){
            count +=1;
        }
        return count;
    }
    public static void main(String[] args) {
        int arr[] = {88,90,100,30,88,555,88,100};
        int value=88;
        // int pos =searchelement(arr,0,value);
        // System.out.println(pos);
        // int count = searchoccurences(arr, 0, value);
        // System.out.println(count);
        int res[] = searchoccurencepos(arr,0, value);
        System.out.println(Arrays.toString(res));
    }
}