package cs382.TA_Assignment4;

import java.util.LinkedList;
import java.util.Scanner;
import java.io.File;
import cs382.TA_Assignment4.Grade;


public class App {
    public static void main(String[] args) {
        // Problem 7
        String a = ""; // a points to an empty string
        String b = null; // b is a null reference that points to nothing
        String c = "John"; // c points to a string “John”
        System.out.println(a == b);
        System.out.println(a.length());

        try {
            System.out.println(b.length());
        } catch (Exception e) {
            System.out.println(e.toString());
        }

        System.out.println(c.length());
        System.out.println(c.substring(0, 3)); //truncate c (“John”) to “Joh”

        // Problem 8
        Scanner sc = new Scanner("John Sam Ed \"\"");

        while (sc.hasNext()) {
            String token = sc.next();
            System.out.print(token + " ->");
            System.out.println(truncate(token));
        }

        // Problem 9
        LinkedList < Grade > aList = new LinkedList < Grade > ();
        try {
            // Read as input Stream by filename
            File file = new File("gradeInput.txt");
            // Using Scanner to read line
            Scanner readFileScanner = new Scanner(file);

            while (readFileScanner.hasNextLine()) {
                String newLine = readFileScanner.nextLine();
                Scanner readLineScanner = new Scanner(newLine);
                aList.add(
                    Grade.SimpleFactory(
                        readLineScanner.next(),
                        readLineScanner.next(),
                        readLineScanner.nextInt(),
                        readLineScanner.nextInt(),
                        readLineScanner.nextInt(),
                        readLineScanner.nextInt(),
                        readLineScanner.nextInt()
                    )
                );
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        // Print List
        System.out.println("ID\t\tName\tLab1\tLab2\tLab3\tMid\tFinal");
        for (Grade grade: aList) {
            System.out.println(
                grade.getId() + '\t' +
                grade.getName() + '\t' +
                grade.getLab1() + '\t' +
                grade.getLab2() + '\t' +
                grade.getLab3() + '\t' +
                grade.getMidTerm() + '\t' +
                grade.getFinalExam() + '\t');
        }
    }

    public static String truncate(String token) {
        try {
            return token.substring(0, 3) + "  No exception.";
        } catch (StringIndexOutOfBoundsException e) {
            return e.toString();
        } catch (NullPointerException e) {
            return e.toString();
        } //end truncate()
    }

}