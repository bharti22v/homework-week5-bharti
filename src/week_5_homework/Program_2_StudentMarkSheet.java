package week_5_homework;

/**
 * Rewrite the student mark sheet programme (From java-homework-week3
 * programmes) using if else and while loop.
 */

import java.util.Scanner;

public class Program_2_StudentMarkSheet {

    // Method to input student details
    public static void inputStudentDetails(Scanner scanner) {
        System.out.println("Enter student details:");
        System.out.print("Name: ");
        String name = scanner.nextLine();
        System.out.print("Roll No: ");
        int rollNo = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        inputSubjectMarks(scanner, name, rollNo);
    }

    // Method to input subject marks
    public static void inputSubjectMarks(Scanner scanner, String name, int rollNo) {
        int mathMarks, scienceMarks, englishMarks;

        // Input marks for three subjects and validate
        do {
            System.out.println("Enter marks for three subjects (Math, Science, English):");
            System.out.print("Math: ");
            mathMarks = scanner.nextInt();
            System.out.print("Science: ");
            scienceMarks = scanner.nextInt();
            System.out.print("English: ");
            englishMarks = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            // Validate marks
            if (mathMarks < 0 || mathMarks > 100 || scienceMarks < 0 || scienceMarks > 100 || englishMarks < 0 || englishMarks > 100) {
                System.out.println("Invalid Input. Marks should be between 0 to 100.");
            }
        } while (mathMarks < 0 || mathMarks > 100 || scienceMarks < 0 || scienceMarks > 100 || englishMarks < 0 || englishMarks > 100);

        calculateMarksheet(name, rollNo, mathMarks, scienceMarks, englishMarks);
    }

    // Method to calculate mark sheet
    public static void calculateMarksheet(String name, int rollNo, int mathMarks, int scienceMarks, int englishMarks) {
        int totalMarks = mathMarks + scienceMarks + englishMarks;
        double percentage = (double) totalMarks / 3;
        String result = (percentage >= 35 && mathMarks >= 35 && scienceMarks >= 35 && englishMarks >= 35) ? "Pass" : "Fail";
        String grade = calculateGrade(percentage);

        printMarksheet(name, rollNo, mathMarks, scienceMarks, englishMarks, totalMarks, percentage, result, grade);
    }

    // Method to calculate grade based on percentage
    public static String calculateGrade(double percentage) {
        if (percentage >= 80) {
            return "A+";
        } else if (percentage >= 60) {
            return "A";
        } else if (percentage >= 50) {
            return "B";
        } else if (percentage >= 35) {
            return "C";
        } else {
            return "Fail";
        }
    }

    // Method to print mark sheet
    public static void printMarksheet(String name, int rollNo, int mathMarks, int scienceMarks, int englishMarks, int totalMarks, double percentage, String result, String grade) {
        System.out.println("_");
        System.out.println("|                               |");
        System.out.println("|          Mark Sheet           |");
        System.out.println("|_|");
        System.out.println("| Name      : " + name + "  |");
        System.out.println("| Roll No   : " + rollNo + "                    |");
        System.out.println("|_|");
        System.out.println("| Subjects  : Marks            |");
        System.out.println("|_|");
        System.out.println("| Math      : " + mathMarks + "        |");
        System.out.println("| Science   : " + scienceMarks + "                    |");
        System.out.println("| English   : " + englishMarks + "                    |");
        System.out.println("|_|");
        System.out.println("| Total     : " + totalMarks + "        |");
        System.out.println("|_|");
        System.out.println("| Percentage: " + percentage + "    |");
        System.out.println("| Result    : " + result + "       |");
        System.out.println("| Grade     : " + grade + "        |");
        System.out.println("|_|");
    }

    // Main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        inputStudentDetails(scanner);
        scanner.close();
    }
}
