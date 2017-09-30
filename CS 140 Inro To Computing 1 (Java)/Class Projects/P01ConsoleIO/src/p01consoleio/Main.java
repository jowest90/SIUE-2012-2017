/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package p01consoleio;

import java.util.Scanner;
/**
 *
 * @author Johnny
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int measurementInDegrees;
        int measurementInMinutes;
        double measurementInSeconds;
        double measurementInFractionalDegrees;
                
        //Get the input
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("Lets convert a Fractional Degree into Degrees, Minutes, and Seconds");
        
        System.out.println("Enter the angle measurement in Fractional Degrees");
        measurementInFractionalDegrees = keyboard.nextDouble();
        
        //Compute
        measurementInDegrees = (int) (measurementInFractionalDegrees);
        
        measurementInMinutes = (int) ((double) (measurementInFractionalDegrees - measurementInDegrees)* 60);
        
        measurementInSeconds = (int) (((double) ((measurementInFractionalDegrees - measurementInDegrees)* 60) - measurementInMinutes) * 60);
        
        //Display
        System.out.println("The angle measurement in Degrees, Minutes, and Seconds is,"
                + measurementInDegrees + " " + measurementInMinutes + " " + measurementInSeconds);
        
        //Input
        System.out.println("Now we will convert Degrees. Minutes, and Seconds, into a Fractional Degree");
        
        System.out.println("Enter the angle measurement of Degrees");
        measurementInDegrees = keyboard.nextInt();
        
        System.out.println("Enter the angle measurement of Minutes");
        measurementInMinutes = keyboard.nextInt();
        
        System.out.println("Enter the angle measurement of Seconds");
        measurementInSeconds = keyboard.nextDouble();
        
        //Compute
        measurementInFractionalDegrees = (((measurementInSeconds / 60) + measurementInMinutes) / 60) + measurementInDegrees;
        
        //Display
        System.out.println("The measurement of "
                + measurementInDegrees + " Degrees, "
                + measurementInMinutes + " Minutes, and "
                + measurementInSeconds + " Seconds equals to "
                + measurementInFractionalDegrees);
    }
}
