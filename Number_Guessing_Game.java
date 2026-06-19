import java.util.Scanner;
import java.util.Random;

public class Number_Guessing_Game{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in) ;
        Random rand = new Random() ;

        int target = rand.nextInt(1, 100) ;
        int attempts = 6, guessedNumber = -1 ;

        System.out.println("You have total " + attempts + " attempts to guess the correct number between 1 to 100.\n") ;


        while((attempts-- > 0) && (guessedNumber != target))
        {
            System.out.print("Enter a guess: ") ;
            guessedNumber = sc.nextInt() ;

            if(guessedNumber == target) {
                System.out.println("\nYou guessed it correct.") ;
            }
            else if(guessedNumber > target) {
                System.out.println("Too High! Try Again\n") ;
            }
            else {
                System.out.println("Too Low! Try Again\n") ;
            }
        }
        
        if(guessedNumber != target)
        {
            System.out.println("\nYou are not able to guess the correct number!!!");
            System.out.println("The correct number is: " + target);
        }

        sc.close() ;
    }
}