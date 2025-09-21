package Arrays;
import java.util.*;

public class pattern {
    public static void printString(int n) {
        for(int i = 0 ; i < n ; i++){
            for(int sp = 1 ; sp <= (n-1)-i ; sp++)

            System.out.println(" ");     
            for (int j = 1; j <= i+1 ; j++) {   
                System.out.print("*  ");
            }           
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        printString(n);   // call method correctly
    }
}
