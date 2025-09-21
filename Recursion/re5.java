/*
 * Author : Anant Mishra
 * Date : 20-sep -2025
 * Description : Recursion example 5
 * 5 program : print  sum of n natural numbers using recursion
 * parametrised 
 */


package Recursion;
import java.util.*;

public class re5 {
    static int sum(int i , int sum){
        if(i < 1){
            return sum;
        }
        return sum(i - 1 , sum + i);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ");
        int n = sc.nextInt();
        System.out.println(sum(n , 0));
    }

}
