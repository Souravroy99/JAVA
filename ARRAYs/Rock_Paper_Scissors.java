import java.util.Scanner;
import java.util.Random;

public class Rock_Paper_Scissors{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random() ;

        String[] chioces = {"rock", "paper", "scissors"} ;
        String playerChoice, computerChoice ;
        boolean playAgain = true ;
        int playerScore = 0, totalPlay = 0 ;

        while(playAgain)
        {
            System.out.print("\nEnter your move (rock, paper, scissors): ");
            playerChoice = sc.next().toLowerCase() ;


            if(!playerChoice.equals("rock") && !playerChoice.equals("paper") && !playerChoice.equals("scissors"))
            {
                System.out.println("Invalid choice!!");
                continue ;
            }

            computerChoice = chioces[rand.nextInt(1, 3)] ;
            System.out.println("Computer's choice: " + computerChoice);

            totalPlay++ ;
            System.out.println();

            if(playerChoice.equals(computerChoice))
            {
                System.out.println("DRAW");
            }
            else if(
                (playerChoice.equals("rock") && computerChoice.equals("scissors")) || 
                (playerChoice.equals("scissors") && computerChoice.equals("paper")) || 
                (playerChoice.equals("paper") && computerChoice.equals("rock")))
            {
                System.out.println("You Won!");
                playerScore++ ;
            }
            else {
                System.out.println("You Lose!");
            }

            System.out.println();
            
            System.out.print("Want to play again (1 or 0)?: ") ;
            playAgain = (sc.nextInt() == 1) ? true : false ;

            System.out.println();
        }


        System.out.println("Your score: " + playerScore + " out of " + totalPlay + " rounds.");

        sc.close();
    }
}