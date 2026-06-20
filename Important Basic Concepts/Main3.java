import java.util.Scanner ;

public class Main3{

    public static void main(String[] args){
        // shopping cart program

        Scanner sc = new Scanner(System.in);

        String item ;
        double price;
        int quantity;
        double total;
        char currency = '$' ;

        System.out.print("What item would you like to buy?: ");
        item = sc.nextLine();

        
        System.out.print("What is the price for each item?: ");
        price = sc.nextDouble();


        System.out.print("What many items would you like to buy?: ");
        quantity = sc.nextInt();

        total = price * quantity ;

        System.out.println("\nYou have bought " + quantity + " " + item + "/s") ;
        System.out.println("Total is: " + currency + total) ;

        sc.close() ; 
    }
}