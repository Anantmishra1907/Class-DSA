
import java.util.*;

public class Reversearrays {
    public int[] reverseArray(int[] arr) {
        int [] temp = new int[arr.length];
        int j = arr.length;
        for (int i = 0; i < arr.length; i++) {
            temp[j - 1] = arr[i];
            j = j - 1;
        }
        return temp;
    }
        public static void main (String[] args){
        int[] arr = {1 , 2 , 3 , 4 ,5 ,6};
        System.out.println("Original Array:");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
        Reversearrays reverse = new Reversearrays();
        int[] reversedArray = reverse.reverseArray(arr);
        System.out.println("Reversed Array:");
        for (int i : reversedArray) {
            System.out.print(i + " ");
        }
    }
}
