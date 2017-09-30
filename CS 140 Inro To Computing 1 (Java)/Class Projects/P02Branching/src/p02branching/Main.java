
package p02branching;

import java.util.Scanner;

public class Main {
    private static final double FULL_PRICE = 10.00;                    // full ticket price
    private static final double ADULT_PRICE = FULL_PRICE * 1.0;        // adult ticket at full price
    private static final double CHILD_PRICE = FULL_PRICE * 0.75;       // child ticket at 50% full price
    private static final double HONOR_STUDENT_FACTOR = 0.90;           // honor student ticket at 90% ticket price
    private static final double AFTERNOON_DISCOUNT_FACTOR = 0.5;       // afternoon ticket at 50% full price
    
    public static void main(String[] args) {
        String showTime;          // E-evening, A-afternoon
        int adultTicketCount;
        int childTicketCount;
        int honorsTicketCount;
        int nonHonorsTicketCount;
        
        double adultCost;
        double childCost;
        double nonHonorsChildCost;
        double honorsChildCost;
        double adultBasePrice;
        double nonHonorsChildBasePrice;
        double honorsChildBasePrice;
        double totalCost;
        
        Scanner keyboard = new Scanner(System.in);
        
        // input show time
        System.out.print("Evening or afternoon show [e|a]: ");
        showTime = keyboard.next();
        
        // input adult ticket count
        System.out.print("Adult tickets: ");
        adultTicketCount = keyboard.nextInt();
        
        // input child ticket count
        System.out.print("Child tickets: ");
        childTicketCount = keyboard.nextInt();
        
        // input honor student count
        System.out.print("\tHow may honors students? ");
        honorsTicketCount = keyboard.nextInt();
        
        // determine base price.
        if (showTime.equalsIgnoreCase("e")) {
            adultBasePrice = ADULT_PRICE;
            nonHonorsChildBasePrice = CHILD_PRICE;
        } else {
            adultBasePrice = ADULT_PRICE * AFTERNOON_DISCOUNT_FACTOR;
            nonHonorsChildBasePrice = CHILD_PRICE * AFTERNOON_DISCOUNT_FACTOR;
        }
        
        // honors student base price.
        honorsChildBasePrice = nonHonorsChildBasePrice * HONOR_STUDENT_FACTOR;

        // compute cost.
        adultCost = adultTicketCount * adultBasePrice;
        
        // non-honor child cost.
        nonHonorsTicketCount = childTicketCount - honorsTicketCount;
        nonHonorsChildCost = nonHonorsTicketCount * nonHonorsChildBasePrice;
        
        if (honorsTicketCount > 0) {
            honorsChildCost = honorsTicketCount * honorsChildBasePrice;
        } else {
            honorsChildCost = 0.0;
        }
        
        // compute total child cost.
        childCost = nonHonorsChildCost + honorsChildCost;
        
        // compute total cost.
        totalCost = adultCost + childCost;
        
        // display invoice.
        System.out.println("\nInvoice Printout:");
        System.out.printf("%30s", "Show time: ");
        
        if (showTime.equalsIgnoreCase("e")) {
            System.out.println("Evening");
        } else {
            System.out.println("Afternoon");
        }
        
        System.out.printf("%30s%d @ $%5.2f = $%7.2f", "Adult tickets: ", adultTicketCount, adultBasePrice, adultCost);
        System.out.printf("\n%30s%d @ $%5.2f = $%7.2f", "Non-honors child tickets: ", nonHonorsTicketCount, nonHonorsChildBasePrice, nonHonorsChildCost);
        System.out.printf("\n%30s%d @ $%5.2f = $%7.2f", "Honors child tickets: ", honorsTicketCount, honorsChildBasePrice, honorsChildCost);
        System.out.printf("\n%30s%d ($%7.2f)\n", "Total tickets: ", adultTicketCount + childTicketCount, totalCost);
    }
}
