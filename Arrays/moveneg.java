package Arrays;
import java.util.*;
public class moveneg {
    static int[] movneg(int []arr){
        int n = arr.length ;
        int [] res = new int[n];

        int left =  0 ;
        int right = n-1 ;
        for(int i = 0 ; i < n ; i++)
        if(arr[i] > 0 ){
            res[right] = arr[i];
            right--;
        }
        else{
            res[left] = arr[i];
            left++;

        }
return res;
    }
    public static void main(String[] args) {
        int [] arr = {1 , -1 , -2 , -3 , 4 , 6 };
         int[] ans = movneg(arr);
        System.out.println(Arrays.toString(ans));
    }
}
