/*
 * Author : Anant Mishra
 * Date : 23 - sep - 2025 ;
 * description : fibonacci series using linear method 
 */


package Recursion;

import java.util.Scanner;

public class re9 {
    static int fib(int n , int a , int b){
         if(n == 0 ){
            return a ;
        }
        if(n == 1 ){
            return b ;
        }
       for(int i = 2 ; i <=n ; i++){
        int c = a+b;
        a = b;
        b = c;
       }
       return b;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ");
        int n = sc.nextInt();
        int a = 0 ;
        int b = 1 ;
        int ans = fib(n , a , b);
        System.out.println(ans);
        sc.close();
    }
}
