import java.util.Scanner ;

public class QuizGame {
    

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in) ;
        
        String[] Qs = {
            "What is the main function of a router?",
            "Which component is known as the brain of a computer?",
            "In which year was Facebook launched?",
            "Who is known as the Father of Computer?",
            "What is considered the first high-level programming language?"
        };

        String[][] options = {
            {
                "1. To connect multiple networks and route data packets",
                "2. To store data permanently",
                "3. To process calculations",
                "4. To display output"
            },
            {
                "1. RAM",
                "2. Hard Disk",
                "3. CPU",
                "4. Monitor"
            },
            {
                "1. 2002",
                "2. 2003",
                "3. 2004",
                "4. 2005"
            },
            {
                "1. Alan Turing",
                "2. Charles Babbage",
                "3. John von Neumann",
                "4. Bill Gates"
            },
            {
                "1. COBOL",
                "2. C",
                "3. Pascal",
                "4. FORTRAN",
            }
        };

        // Correct answers (option numbers)
        int[] answers = {1, 3, 3, 2, 4};
        int score = 0, guess ;
        
        System.out.println("\nWelcome to Java quiz game !\n");

        for(int i=0 ; i<Qs.length ; i++)
        {
            System.out.println("Q" + (i+1) + ". " + Qs[i]);

            for(String opt: options[i]) {
                System.out.println(opt);
            }

            System.out.print("\nEnter your answer: ");
            guess = sc.nextInt() ;
            
            if(guess == answers[i]) {
                score++ ;
                System.out.println("\n >>> Correct <<<\n");
            }
            else {
                System.out.println("\n >>> Wrong <<<\n");
            }
        }

        System.out.println("Your total score is: " + score + " out of " + Qs.length + " !");

        sc.close() ;
    }
}