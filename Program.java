//import stuff here

//Your code here
import java.util.Scanner;

public class OldToDecimalCurrency {
    public static void main(String[] args) {
        final int KELVS_PER_BUCK = 20;  // 20 klevins in 1 schrute-buck
        final int NICKS_PER_KELV = 12;  // 12 stanley-nickels in 1 klevin
        final int NICKS_PER_BUCK = 100; // 100 stanley-nickels in 1 decimal schrute-buck

        Scanner input = new Scanner(System.in);

        // Input: Asking for schrute-bucks, klevins, and stanley-nickels
        System.out.print("Enter schrute-bucks: ");
        int bucks = input.nextInt();

        System.out.print("Enter klevins: ");
        int kelvs = input.nextInt();

        System.out.print("Enter stanley-nickels: ");
        int nicks = input.nextInt();

        // Calculation: Convert to decimal schrute-bucks
        double decBucks = bucks + (kelvs * NICKS_PER_KELV + nicks) / (double) NICKS_PER_BUCK;

        // Output: Display the result
        System.out.println("Decimal schrute-bucks = $" + decBucks);
    }
}
//Paste console output below:
/*


*/
