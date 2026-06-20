import java.util.Scanner;

public class Switch {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in) ;

        System.out.print("Enter the day of the week: ") ;
        String str = sc.next() ;

        switch (str)
        {
            case "Monday", "Tuesday", "Wedday", "Thursday", "Friday" -> System.out.print("Weekday") ;
            case "Saturday", "Sunday" -> System.out.print("Weekend") ;
            default -> System.out.println("Not a day") ;
        }

        
        sc.close() ;
    }
}