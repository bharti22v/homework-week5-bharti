package week_5_homework;

/**
 *  Write a Java program to iterate through all elements in an array list using Iterater.
 */

import java.util.ArrayList;
import java.util.Iterator;

public class program_5_Iterator {

    public static void main(String[] args) {
        // Create a new ArrayList
        ArrayList<String> arrayList = new ArrayList<>();

        // Add elements to the ArrayList
        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add("Orange");
        arrayList.add("Grapes");
        arrayList.add("Mango");

        // Get an Iterator for the ArrayList
        Iterator<String> iterator = arrayList.iterator();
        System.out.println("Elements in the ArrayList:");
        while (iterator.hasNext()) {
            String element = iterator.next();
            System.out.println(element);
       }
    }
}

