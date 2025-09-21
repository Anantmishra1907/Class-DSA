/*
 * Author : Anant Mishra
 * Date : 20-sep-2025
 * Description : Recursion example 4
 * 4 program : print factorial of a number using recursion
 */




package Recursion;
import java.util.*;
public class re4 {
    public static int factorial(int n , int i  ){
        if( i < 1){

            return 1;
        }
        return i * factorial(n , i - 1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(factorial(n , n));
    }
}
