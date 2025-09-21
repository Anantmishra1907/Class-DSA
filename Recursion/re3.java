/*
 * Author : Anant Mishra
 * Date : 19-sep-2025
 * Description : Recursion example 3
 * 3 program : print numbers from n to 1 using recursion
 */



package Recursion;
import java.util.*;

public class re3 {
    public static void printnum(int n ){
        if(n  == 0){
            return;
        }
        System.out.println(n);
        printnum(n - 1);
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printnum(n);
        
    }
    
}
