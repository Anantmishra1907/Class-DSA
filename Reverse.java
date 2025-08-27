public class Reverse{
    public int[] reverseArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] arr = {1 , 2 , 3 , 4 ,5 ,6};
        System.out.println("Original Array:");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
        Reverse reverse = new Reverse();
        int[] reversedArray = reverse.reverseArray(arr);
        System.out.println("Reversed Array:");
        for (int i : reversedArray) {
            System.out.print(i + " ");
        }
    }
}