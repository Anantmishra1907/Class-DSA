/*
 * Aurhor : Anant Mishra 
 * Date : 22 - sep - 2025 ;
 * Description : Reverse the array using recursion (Two variable)
 */


package Recursion;
import java.util.*;

public class re8{
    public static void reverse( int [] arr  ,int i , int r){
        if(i  >= r ){
            return;
        }
        int temp = arr[i];
        arr[i] = arr[r];
        arr[r] = temp ;
        reverse( arr , i+1  , r-1 ) ;

    }
    public static void main(String[] args) {
        int[ ] arr = {1 , 2 , 3 , 4 , 5 };
        reverse(arr, 0, arr.length -1 );
        System.out.println(Arrays.toString(arr));
    }
}

