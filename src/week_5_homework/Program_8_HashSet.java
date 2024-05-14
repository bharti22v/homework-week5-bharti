package week_5_homework;

import java.util.HashSet;

/**
 *  Use a HashSet that stores Integer Objects. Store the number 4, 7 and 8 to Sets.
 * Show which numbers between 1 and 10 are in the set. (Hint: use for loop and if
 * else)
 */

public class Program_8_HashSet {


    // Method to create and populate the HashSet with specified numbers
    public static HashSet<Integer> createNumberSet() {
        HashSet<Integer> numberSet = new HashSet<>();
        numberSet.add(1);
        numberSet.add(4);
        numberSet.add(9);
        return numberSet;
    }

    // Method to check which numbers between 1 and 10 are in the set
    public static void checkNumbersInSet(HashSet<Integer> numberSet) {
        System.out.println("Numbers between 1 and 10 in the set:");
        for (int i = 1; i <= 10; i++) {
            if (numberSet.contains(i)) {
                System.out.println(i + " is in the set.");
            } else {
                System.out.println(i + " is not in the set.");
            }
        }
    }

    public static void main(String[] args) {

        // Create and populate the HashSet
        HashSet<Integer> numberSet = createNumberSet();

        // Check which numbers between 1 and 10 are in the set
        checkNumbersInSet(numberSet);
    }
}