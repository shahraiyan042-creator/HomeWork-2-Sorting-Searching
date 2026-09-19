import java.util.Arrays;
public class Main{
    public static void main(String[] args){
        // Original array
        int[] arr = {23, 44, 30, 65, 42, 22, 43, 77, 89, 67, 40, 91};
        System.out.println("Original Array: " + Arrays.toString(arr));
        System.out.println();

        // Bubble Sort
        int[] bubbleArray = Arrays.copyOf(arr, arr.length);//created new array using Arrays.copyOf() so original array remains unchanged;
        System.out.println("Bubble Sort Result: " + Arrays.toString(bubbleSort(bubbleArray)));
        System.out.println();

        // Merge Sort
        int[] mergeArray = Arrays.copyOf(arr, arr.length);//created new array using Arrays.copyOf() so original array remains unchanged;
        System.out.println("Merge Sort Result: " + Arrays.toString(mergeSort(mergeArray, 0, mergeArray.length - 1)));
        System.out.println();

        // Linear Search
        System.out.println("Linear Search : ");
        System.out.print("Searching for ");
        linearSearch(arr, 23);//output:Found at index 0
        System.out.print("Searching for ");
        linearSearch(arr, 91);//output:Found at index 11
        System.out.print("Searching for ");
        linearSearch(arr, 500);//output:Target not found
        System.out.println();

        //Binary Search
        // Uses bubbleArray, which was already sorted using Bubble Sort
        System.out.println("Binary Search : ");
        System.out.print("Searching for ");
        binarySearch(bubbleArray, 23);//output : Target found at index 1
        System.out.print("Searching for ");
        binarySearch(bubbleArray, 91);//output : Target found at index 11
        System.out.print("Searching for ");
        binarySearch(bubbleArray, 500);//output : Target not found
    }


    // Method : BubbleSort (returns int[])
    public static int[] bubbleSort(int[] arr){
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }

    // Method : Merge Sort (returns int[])
    public static int[] mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            int middle = (left + right) / 2;
            // Divide
            mergeSort(arr, left, middle);
            mergeSort(arr, middle + 1, right);
            // Merge
            int i = left;
            int j = middle + 1;
            int[] temp = new int[right - left + 1];
            int k = 0;
            while (i <= middle && j <= right) {
                if (arr[i] < arr[j]) {
                    temp[k] = arr[i];
                    i++;
                } else {
                    temp[k] = arr[j];
                    j++;
                }
                k++;
            }
            while (i <= middle) {
                temp[k] = arr[i];
                i++;
                k++;
            }
            while (j <= right) {
                temp[k] = arr[j];
                j++;
                k++;
            }
            for (i = 0; i < temp.length; i++) {
                arr[left + i] = temp[i];
            }
        }
        return arr;
    }


    // Method : Linear Search 
    public static void linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                System.out.println("Target = " + target);
                System.out.println("Found at index " + i);
                return;
            }
        }
        System.out.println("Target = " + target);
        System.out.println("Target not found");
    }

    // Method : Binary Search
    public static void binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            int middle = (left + right) / 2;
            if (arr[middle] == target) {
                System.out.println("Target: " + target);
                System.out.println("Target found at index " + middle);
                return;
            }
            if (target > arr[middle]) {
                left = middle + 1;
            } else {
                right = middle - 1;
            }
        }
        System.out.println("Target: " + target);
        System.out.println("Target not found");
    }

}
