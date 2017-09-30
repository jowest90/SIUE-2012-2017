/*
 * John West
 * 9/28/12
 * Lab sec. 21
 * If else statement and format
 */
package lab5;

import java.util.Scanner;

public class Lab5 {

    private static final String ENTREE_ONE_NAME = "Haggis";
    private static final String ENTREE_TWO_NAME = "Tripe ";
    private static final String SIDE_ONE_NAME = "Fries ";
    private static final String SIDE_TWO_NAME = "Chips ";
    private static final String DRINK_ONE_NAME = "Tea   ";
    private static final String DRINK_TWO_NAME = "Soda  ";
    private static final String DESSERT_ONE_NAME = "Cake  ";
    private static final String DESSERT_TWO_NAME = "Gum   ";
    public static final double ENTREE_ONE_PRICE = 3.50;
    public static final double ENTREE_TWO_PRICE = 3.00;
    public static final double SIDE_ONE_PRICE = 1.00;
    public static final double SIDE_TWO_PRICE = 1.50;
    public static final double DRINK_ONE_PRICE = 1.50;
    public static final double DRINK_TWO_PRICE = 1.00;
    public static final double DESSERT_ONE_PRICE = 1.25;
    public static final double DESSERT_TWO_PRICE = 1.50;
    
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        
        String entreeName;
        String sideName;
        String drinkName;
        String dessertName;
        
        int entree;
        int side;
        int drink;
        int dessert;
        
        double total;
        double entreePrice;
        double sidePrice;
        double drinkPrice;
        double dessertPrice;
                
        
        System.out.println("Which entree would you like?");
        System.out.printf("1) %6s : $%1.2f %n", ENTREE_ONE_NAME, ENTREE_ONE_PRICE);
        System.out.printf("2) %6s : $%1.2f %n", ENTREE_TWO_NAME, ENTREE_TWO_PRICE);
        System.out.print("?: ");
        entree = keyboard.nextInt();
        
        if (entree == 1){
            entreeName = ENTREE_ONE_NAME;
            entreePrice = ENTREE_ONE_PRICE;
        } else {
            entreeName = ENTREE_TWO_NAME;
            entreePrice = ENTREE_TWO_PRICE;
        }
        
        System.out.println("Which side would you like?");
        System.out.printf("1) %6s : $%1.2f %n", SIDE_ONE_NAME, SIDE_ONE_PRICE);
        System.out.printf("2) %6s : $%1.2f %n", SIDE_TWO_NAME, SIDE_TWO_PRICE);
        System.out.print("?: ");
        side = keyboard.nextInt();
        
        if (side == 1){
            sideName = SIDE_ONE_NAME;
            sidePrice = SIDE_ONE_PRICE;
        } else {
            sideName = SIDE_TWO_NAME;
            sidePrice = SIDE_TWO_PRICE;
        }
        
        System.out.println("Which side would you like?");
        System.out.printf("1) %6s : $%1.2f %n", DRINK_ONE_NAME, DRINK_ONE_PRICE);
        System.out.printf("2) %6s : $%1.2f %n", DRINK_TWO_NAME, DRINK_TWO_PRICE);
        System.out.print("?: ");
        drink = keyboard.nextInt();
        
        if (drink == 1){
            drinkName = DRINK_ONE_NAME;
            drinkPrice = DRINK_ONE_PRICE;
        } else {
            drinkName = DRINK_TWO_NAME;
            drinkPrice = DRINK_TWO_PRICE;
        }
        System.out.println("Which side would you like?");
        System.out.printf("1) %6s : $%1.2f %n", DESSERT_ONE_NAME, DESSERT_ONE_PRICE);
        System.out.printf("2) %6s : $%1.2f %n", DESSERT_TWO_NAME, DESSERT_TWO_PRICE);
        System.out.print("?: ");
        dessert = keyboard.nextInt(); 
        
        if (dessert == 1){
            dessertName = DESSERT_ONE_NAME;
            dessertPrice = DESSERT_ONE_PRICE;
        } else {
            dessertName = DESSERT_TWO_NAME;
            dessertPrice = DESSERT_TWO_PRICE;
        }
        
            total = entreePrice + sidePrice + drinkPrice + dessertPrice;
            
            System.out.println("Your meal:");
            System.out.printf("%-12s%-12s%-12s%n", "Item", "Choice", "Cost");
            System.out.printf("%-12s%-12s%1.2f%n", "Entree", entreeName, entreePrice);
            System.out.printf("%-12s%-12s%1.2f%n", "Side", sideName, sidePrice);
            System.out.printf("%-12s%-12s%1.2f%n", "Drink", drinkName, drinkPrice);
            System.out.printf("%-12s%-12s%1.2f%n", "Dessert", dessertName, dessertPrice);
            System.out.printf("%-24s%1.2f%n", "Total charge", total);
    }
}
