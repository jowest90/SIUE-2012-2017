/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6;

import java.util.Scanner;
        
public class Lab6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int x;
        
        Scanner keyboard = new Scanner(System.in);
            
            do {
            System.out.print("Enter a number between 1 and 20: ");
            x = keyboard.nextInt();
        } while (x < 1 || x > 20);
        
            do {
            System.out.print("Enter another number between 1 and 20: ");
            x = keyboard.nextInt();
        } while (x < 1 || x > 20);
            
          while(x < 1 || x > 20){
              System.out.println(x++);
          }
                    
    }
}
   