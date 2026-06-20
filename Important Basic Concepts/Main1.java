import java.util.Scanner;
    
public class Main1 {

    public static void main(String[] args) {
/*
        Scanner scan = new Scanner(System.in) ;

        System.out.print("Enter Something_1 : ") ;
        String name1 = scan.nextLine() ; // The whole line

        System.out.print("Enter Something_2 : ") ;
        String name2 = scan.next() ; // First string

        System.out.print("Enter your age : ") ;
        int age = scan.nextInt() ;

        System.out.print("Enter your gpa : ") ;
        double gpa = scan.nextDouble() ;

        System.out.print("Are you student? (true/ false) : ") ;
        boolean isStudent = scan.nextBoolean() ;

        System.out.println(name1) ;
        System.out.println(name2) ;
        System.out.println(age) ;
        System.out.println(gpa) ;
        System.out.println(isStudent) ;


        scan.close(); 
*/

        Scanner sc = new Scanner(System.in) ;

        System.out.print("Enter height: ") ;    
        double height = sc.nextDouble() ;
        
        System.out.print("Enter width: ") ;
        double width = sc.nextDouble() ;


        double area = width * height ;


        System.out.print("Area of rectangle: " + area + "cm²") ; // Numlock + Alt + 0178 --> For superscript


        sc.close() ;
    }
}