package method_problems;

import java.util.Arrays;

public class ZeroMover {
    public static void main(String[] args) {
        int[] testArray = new int[]{1,2,0,0,4,0,5};
//        zeroesToEnd(testArray);
        zeroesToEndBubbleSortVersion(testArray);
        System.out.println(Arrays.toString(testArray));
    }

    public static void zeroesToEnd(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {

            // Assume the current position holds
            // a non-zero element
            int zeroIndex = i;

            // Iterate through the unsorted portion
            // to find the actual minimum
            for (int j = i + 1; j < n; j++) {
                if (arr[j] == 0) {

                    // Update zeroIndex if a smaller element
                    // is found
                    zeroIndex = j;
                }
            }

            // Move minimum element to its
            // correct position
            int temp = arr[i];
            arr[i] = arr[zeroIndex];
            arr[zeroIndex] = temp;
        }
    }

    public static void zeroesToEndAlpha(int[] arr) {

    }

    public static void zeroesToEndBubbleSortVersion(int arr[]){
        // Use modified bubble sort swap method to move all zero values to the beginning of the array.
        int n = arr.length;
        int i, j, temp;
        boolean swapped;
        for (i = 0; i < n - 1; i++) {
            swapped = false;
            for (j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1] && arr[j + 1] == 0) {

                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }

            if (swapped == false)
                break;
        }
    }


}

