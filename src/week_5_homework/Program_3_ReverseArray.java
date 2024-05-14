package week_5_homework;

/**
 * Write a Java program to reverse an array of integer values.
 */

public class Program_3_ReverseArray {

    // Method to reverse an array of integers
    public static int[] reverseArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            // Swap elements at start and end positions
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            // Move start and end pointers towards the center
            start++;
            end--;
        }

        return arr;
    }

    public static void main(String[] args) {
        int[] originalArray = {1, 2, 3, 4, 5};

        // Reverse the array
        int[] reversedArray = reverseArray(originalArray);

        // Print the reversed array
        System.out.println("Reversed Array:");
        for (int num : reversedArray) {
            System.out.print(num + " ");
        }
    }
}
