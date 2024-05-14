package week_5_homework;

/**
 * Write a Java program to retrieve an element (at a specified index) from a given
 * array list
 */

import java.util.ArrayList;

public class Program_6_Retrieve {
    public static void main(String[] args) {
        // Create a new ArrayList
        ArrayList<String> arrayList = new ArrayList<>();

        // Add elements to the ArrayList
        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add("Orange");
        arrayList.add("Grapes");
        arrayList.add("Mango");
        // Specify the index from which to retrieve the element
        int index = 2; // Index starts from 0, so index 2 corresponds to the third element

        // Check if the index is valid
        if (index >= 0 && index < arrayList.size()) {
            // Retrieve the element at the specified index
            String element = arrayList.get(index);
            System.out.println("Element at index " + index + ": " + element);
        } else {
            System.out.println("Invalid index");
        }
    }
}
