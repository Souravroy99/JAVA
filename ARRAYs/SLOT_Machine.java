import java.util.Scanner ;
import java.util.Random ;

public class SLOT_Machine
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in) ;

        int balance = 100, bet, payout ;
        String[] row;

        System.out.println("Welcome to Java Slots");
        System.out.println("Symbols: @ # $ % &") ;

        while(balance > 0)
        {
            System.out.println("Current Balance: " + balance);
            System.out.print("\nPlace our bet amount: ");
            bet = sc.nextInt();

            if(bet > balance)
            {
                System.out.println("\nInsufficient balance");
                continue; 
            }
            else if(bet <= 0)
            {
                System.out.println("\nBet must be > 0");
                continue;
            }
            else {
                balance -= bet ;
            }

            System.out.println("\nSpinning...");
            row = spinRow();
            printRow(row) ;
        }

        sc.close() ;
    }

    static String[] spinRow()
    {
        String[] symbols = {"@", "#", "$", "%", "&"} ;
        String[] row = new String[3];
        Random rand = new Random() ;

        for(int i=0 ; i<3 ; i++)
        {
            row[i] = symbols[rand.nextInt(symbols.length)] ;
        }

        return row ;
    }

    static void printRow(String[] row) {
        System.out.println(" " + String.join(" | ", row));
    }
}