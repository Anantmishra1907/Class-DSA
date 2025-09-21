/*
 * Author : Anant Mishra
 * Date : 20-sep -2025
 * Description : Recursion example 7
 * program 7 : reverse an array (using loops)
 */


package Recursion;
import java.util.*;

public class re7 {
    public static void reverse(int arr[]){
        int n = arr.length;
        int start = 0 ;
        int end = n-1;
        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements of array ");
        for(int i = 0 ; i < n ; i++){
            arr[i] = sc.nextInt();
        }
        reverse(arr);
        System.out.println("Reversed array is ");
        for(int i = 0 ; i < n ; i++){
            System.out.print(arr[i] + " ");
        }
    }       
}
