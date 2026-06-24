import java.util.Scanner ;
import java.util.Random ;

public class SLOT_Machine
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in) ;

        int balance = 100, bet, payout ;
        String[] row;
        String playAGain = "-1" ;

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

            payout = getPayOut(row, bet) ;

            if(payout > 0) {
                System.out.println("\nYou won $" + payout);
                balance += payout ;
            }
            else {
                System.out.println("\nYou lose this round!!");
            }
            
            System.out.println();
            System.out.print("\nDo you want to play again?(Y/N) : ");

            playAGain = sc.next().toUpperCase();

            if(playAGain.equals("N")) {
                break ;
            }
        }

        System.out.println("Thank you!!");
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

    static int getPayOut(String[] row, int bet)
    {
        if(row[0].equals(row[1]) && row[0].equals(row[2]))
        {
            return switch(row[0]) {
                case "@" -> bet * 3 ;
                case "#" -> bet * 5 ;
                case "$" -> bet * 10 ;
                case "%" -> bet * 20 ;
                case "&" -> bet * 30 ;
                default -> 0 ;
            };
        }

        return 0;
    }
}