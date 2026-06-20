import java.util.Scanner;

public class Main2 {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in) ;

        System.out.print("Enter value of integer x: ") ;
        int x = sc.nextInt() ;

        System.out.print("Enter value of integer y: ") ;
        int y = sc.nextInt() ;

        double z = (double)x / y ;

        System.out.println(z) ;
    }
}