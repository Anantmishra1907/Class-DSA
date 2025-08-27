public class ArrayElements {
    public int[] arrangeArray(int[] arr) {
        int n = arr.length;
        int[] result = new int[n];  
        int j = 0; 
        int k = 1; 

        for (int i = 0; i < n; i++) {
            if (arr[i] > 0 && j < n) {
                result[j] = arr[i];
                j += 2;
            } else if (arr[i] < 0 && k < n) {
                result[k] = arr[i];
                k += 2;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {10, -20, -10, 20, -40};
        System.out.println("Original Array:");
        for (int j : arr) {
            System.out.print(j + " ");
        }

        ArrayElements arrayElements = new ArrayElements();
        int[] arrangedArray = arrayElements.arrangeArray(arr);

        System.out.println("\nArranged Array (Positives at even, Negatives at odd):");
        for (int i : arrangedArray) {
            System.out.print(i + " ");
        }
    }
}
