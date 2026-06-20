import java.util.Scanner ;

public class BankingProgram 
{
    static Scanner sc = new Scanner(System.in) ;

    public static void main(String[] args)
    {

        boolean isRunning = true ;
        double balance = 0 ;
        int choice ;

        while(isRunning) 
        {
            System.out.println("\nBanking Program") ;
            System.out.println("***************") ;
            System.out.println("1. Show Balance") ;
            System.out.println("2. Deposit") ;
            System.out.println("3. Withdraw") ;
            System.out.println("4. Exit") ;
            System.out.println("***************\n") ;

            System.out.print("Enter your choice (1-4): ") ;
            choice = sc.nextInt() ;

            switch(choice)
            {
                case 1 ->   showBalance(balance) ;
                case 2 ->   balance += deposite() ; 
                case 3 ->   balance -= withdraw(balance) ; 
                case 4 ->   isRunning = false ;
                default -> System.out.println("Invalid choice!!") ;
            }
        }

        System.out.println("\n\nThank you! Have a nice day!") ;
        sc.close() ;
    }

    static void showBalance(double balance) {
        System.out.printf("$%.2f\n", balance) ;
    }

    static double deposite() {

        System.out.print("Enter deposite amount: ") ;
        double amount = sc.nextDouble() ;

        if(amount <= 0) {
            System.out.println("Amount should be positive") ;
            return 0;
        }

        return amount ;
    }

    
    static double withdraw(double balance) {

        System.out.print("Enter amount to be withdrawn: ") ;
        double amount = sc.nextDouble() ;

        if(amount <= 0) {
            System.out.println("Amount should be positive") ;
            return 0 ;
        }
        else if(amount > balance) {
            System.out.println("Insufficient balance") ;
            return 0 ;
        }

        return amount ;
    }
}