import java.util.Scanner ;
import java.util.Random ;

public class DiceRoller
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in) ;
        Random rand = new Random() ;

        int numOfDice, total = 0 ;

        System.out.print("Enter the number of dice to roll: ");
        numOfDice = sc.nextInt() ;

        if(numOfDice > 0) 
        {
            for(int i=0 ; i<numOfDice ; i++)
            {
                int roll = rand.nextInt(1, 7) ; // 1st number is inclusive, 2nd number is exclusive

                printDie(roll) ;
                System.out.println("You rolled: " + roll) ;

                total += roll ;
            }

            System.out.print("\nTotal: " + total) ;
        }
        else
        {
            System.out.print("Number of dice should be > 0");
        }
        
        sc.close() ;
    }

    static void printDie(int num)
    {
        String dice1 = """
                     -------
                    |       |
                    |   0   |
                    |       |
                     -------
                    """; 

        String dice2 = """
                     -------
                    | 0     |
                    |       |
                    |     0 |
                     -------
                    """; 

        String dice3 = """
                     -------
                    | 0     |
                    |   0   |
                    |     0 |
                     -------
                    """; 

        String dice4 = """
                     -------
                    | 0   0 |
                    |       |
                    | 0   0 |
                     -------
                    """; 

        String dice5 = """
                     -------
                    | 0   0 |
                    |   0   |
                    | 0   0 |
                     -------
                    """; 

        String dice6 = """
                     -------
                    | 0   0 |
                    | 0   0 |
                    | 0   0 |
                     -------
                    """; 

        switch(num) {
            case 1 -> System.out.println(dice1) ;
            case 2 -> System.out.println(dice2) ;
            case 3 -> System.out.println(dice3) ;
            case 4 -> System.out.println(dice4) ;
            case 5 -> System.out.println(dice5) ;
            case 6 -> System.out.println(dice6) ;
            default -> System.out.println("\n Nothing \n") ;
        }
    }
}