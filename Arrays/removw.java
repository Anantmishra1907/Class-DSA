package Arrays;
import java.util.*;

public class removw {
    static void remove(int[] arr , int k){
        if(k  < 0 || k > arr.length){
            return;
        }
        int n = arr.length;
        for(int i = 0 ; i < n ; i++){
            if( i == k ){
                arr[i] = arr[i+1];
                arr[n-1] = 0;
            }
        }

    }
    public static void main(String[] args) {
        int[] arr = {1 , 2 , 3 , 4 , 5};
        int j = 4;
        remove(arr, j);
        System.out.println(Arrays.toString(arr));
    }
}
