/*
 * Author : Anant Mishra
 * Date : 20-sep -2025
 * Description : Recursion example 6
 * program 6 : sum of n natural numbers using recursion (functional)
 */



package Recursion;

import java.util.Scanner;

public class re6 {
    static int sum(int n){
        if( n == 0 ){
            return  0 ;
        }
        return n + sum(n - 1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ");
        int n = sc.nextInt();
        System.out.println(sum(n));
    }
    
}
