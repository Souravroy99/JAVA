import java.util.Scanner;

public class Calculator{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in) ;
        
        double num1, num2, result = -1 ;
        char operator ;

        System.out.print("Enter num1 value: ") ;
        num1 = sc.nextDouble();
        
        System.out.print("Enter num2 value: ") ;
        num2 = sc.nextDouble();

        System.out.print("Type the operation (+, -, /, *, ^): ") ;
        operator = sc.next().charAt(0) ;

        switch(operator)
        {
            case '+' -> result = num1 + num2 ;
            case '-' -> result = num1 - num2 ;
            case '*' -> result = num1 * num2 ;
            case '/' -> {
                if(num2 == 0) System.out.println("Cannot divide by Zero.") ;
                else result = num1 / num2 ;
            }
            case '^' -> result = Math.pow(num1, num2) ;
            default -> System.out.println("Invalid operator") ;
        }

        System.out.println("The result: " + result) ;
    }
}