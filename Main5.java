import java.util.Scanner;

public class Main5{
    public static void main(String[] args)
    {
        String str = "Sourav Roy" ;

        int length = str.length() ;
        char character = str.charAt(2) ;
        int index = str.indexOf('o') ;
        int LAST_index = str.lastIndexOf('o') ;



        System.out.println(length) ;
        System.out.println(character) ;
        System.out.println("First index: " + index) ;
        System.out.println("Last index: " + LAST_index) ;
        System.out.println("Last index: " + LAST_index) ;
        System.out.println("UPPER CASE: " + str.toUpperCase()) ;
        System.out.println("LOWER CASE: " + str.toLowerCase()) ;
        System.out.println("Does it contains? : " + str.contains("Ro")) ;
        System.out.println("Is it equal? : " + str.equals("Sourav Roy")) ;


        System.out.println("Substring: " + str.substring(2, 4)) ; // Both are index-position


        Scanner sc = new Scanner(System.in) ;
        System.out.print("\nEnter your email: ") ;
        String email = sc.next() ;

        String username = email.substring(0, email.indexOf('@'));
        String domain = email.substring(email.indexOf('@') + 1);

        System.out.println("Username: " + username) ;
        System.out.println("Domain: " + domain) ;

        sc.close() ;
    }
}