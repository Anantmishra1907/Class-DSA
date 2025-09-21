/*
 * Author : Anant Mishra
 * Date : 19-sep-2024
 * Description : Recursion example 2
 * 2 program : print numbers from 1 to n using recursion
 */


package Recursion;
import java.util.*;

public class re2 {
    public static void printnum(int count ,int n ){

        if(count > n){
            return;
        }
        System.out.println(count);
        printnum( count + 1, n);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printnum(1, n);
    }

}
