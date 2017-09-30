/*    File: Main.java
 *    Name: John West
 *    Revised: 5/26/2013
 *    Course: CS150 - Introduction to Computing II - Summer 13
 * 
 *    Desc: This program ...Uses file IO for a list of names, superclasses and 
 *    subclasses to organize the groups of names to thier respected groups.
 */
package hw01;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner fin = null;
        try {
            fin = new Scanner(new File("employee.txt"));
        } catch (FileNotFoundException e) {
            System.err.println("Error opening the file " + "employee.txt");
            System.exit(1);
        }// end try

        System.out.println("(1) List all Employees:");
        while (fin.hasNextLine()) {
            String record = fin.nextLine();
            String[] fields = record.split(",", 0);
            int ivar = Integer.parseInt(fields[6]);
            double dvar = Double.parseDouble(fields[9]);
            if (fields[10].equalsIgnoreCase("a")) {
                Umember admin = new Administer(fields[11], ivar, fields[7], fields[8], dvar, fields[0], fields[1], fields[2], fields[3], fields[4], fields[5]);
                System.out.println(admin);
            } else {
                int ivar2 = Integer.parseInt(fields[12]);
                Umember fac = new Faculty(fields[11], ivar, ivar2, fields[7], fields[8], dvar, fields[0], fields[1], fields[2], fields[3], fields[4], fields[5]);
                System.out.println(fac);
            }
        }
        System.out.println("");
        try {
            fin = new Scanner(new File("student.txt"));
        } catch (FileNotFoundException e) {
            System.err.println("Error opening the file " + "student.txt");
            System.exit(1);
        }// end try
        System.out.println("(2) List all Students:");
        while (fin.hasNextLine()) {
            String record2 = fin.nextLine();
            String[] fields2 = record2.split(",", 0);
            int ivar = Integer.parseInt(fields2[6]);
            if (fields2[8].equalsIgnoreCase("u")) {
                Umember undergrad = new Undergraduate(fields2[9], ivar, fields2[7], fields2[0], fields2[1], fields2[2], fields2[3], fields2[4], fields2[5]);
                System.out.println(undergrad);
            } else {
                Umember grad = new Graduate(fields2[9], ivar, fields2[7], fields2[0], fields2[1], fields2[2], fields2[3], fields2[4], fields2[5]);
                System.out.println(grad);
            }
        }
        System.out.println("");
        System.out.println("(3) List all faculty members:");
        try {
            fin = new Scanner(new File("employee.txt"));
        } catch (FileNotFoundException e) {
            System.err.println("Error opening the file " + "employee.txt");
            System.exit(1);
        }// end try
        while (fin.hasNextLine()) {
            String record = fin.nextLine();
            String[] fields = record.split(",", 0);
            int ivar = Integer.parseInt(fields[6]);
            double dvar = Double.parseDouble(fields[9]);
            if (fields[10].equalsIgnoreCase("f")) {
                int ivar2 = Integer.parseInt(fields[12]);
                Umember fac = new Faculty(fields[11], ivar, ivar2, fields[7], fields[8], dvar, fields[0], fields[1], fields[2], fields[3], fields[4], fields[5]);
                System.out.println(fac);
            }
        }
        System.out.println("");
        System.out.println("(4) list all aministers:");
        try {
            fin = new Scanner(new File("employee.txt"));
        } catch (FileNotFoundException e) {
            System.err.println("Error opening the file " + "employee.txt");
            System.exit(1);
        }// end try
        while (fin.hasNextLine()) {
            String record = fin.nextLine();
            String[] fields = record.split(",", 0);
            int ivar = Integer.parseInt(fields[6]);
            double dvar = Double.parseDouble(fields[9]);
            if (fields[10].equalsIgnoreCase("a")) {
                Umember admin = new Administer(fields[11], ivar, fields[7], fields[8], dvar, fields[0], fields[1], fields[2], fields[3], fields[4], fields[5]);
                System.out.println(admin);
            }
        }
        System.out.println("");
        System.out.println("(5) List all undergraduate students in 'CS'");
        try {
            fin = new Scanner(new File("student.txt"));
        } catch (FileNotFoundException e) {
            System.err.println("Error opening the file " + "student.txt");
            System.exit(1);
        }// end try
        while (fin.hasNextLine()) {
            String record2 = fin.nextLine();
            String[] fields2 = record2.split(",", 0);
            int ivar = Integer.parseInt(fields2[6]);
            if (fields2[8].equalsIgnoreCase("u")) {
                if (fields2[7].equalsIgnoreCase("CS")) {
                    Umember undergrad = new Undergraduate(fields2[9], ivar, fields2[7], fields2[0], fields2[1], fields2[2], fields2[3], fields2[4], fields2[5]);
                    System.out.println(undergrad);
                }
            }
        }
    }
}
