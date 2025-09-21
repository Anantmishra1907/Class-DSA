/*
 * Author: Anant Mishra
 * Date: 19-sep-2025
 * Description: Recursion basic example
 * 1 program : print names five times using recursion
 */


package Recursion;

import java.util.Scanner;

public class re1 {
    public static void printName(int n) {
        if (n == 0) {
            return;
        }
        System.out.println("Anant Mishra");
        printName(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printName(n);
    }

    
}
