/*
 * Author : Anant Mishra
 * Date : 23 - sep - 2025 ;
 * description : fibonacci series using recursion;
 */



package Recursion;

import java.util.Scanner;

public class re10 {
    static int fib(int n){
        if(n <= 1 ){
            return n ;
        }
        return fib(n-1) + fib(n-2) ;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();
        System.out.println("Fibonacci number at position " + n + " is: " + fib(n));
        sc.close();     
    }
}
