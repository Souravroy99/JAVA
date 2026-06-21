import java.util.Arrays;

public class TwoDArray {
    public static void main(String[] args)
    {
        String[] fruits = {"mango", "banana", "pineapple", "orange"} ;
        String[] vegetables = {"potato", "onion", "ginger", "garlic"} ;
        String[] meats = {"chicken", "mutton", "beef", "pork"} ;

        String[][] groceries = {fruits, vegetables, meats} ;


        for(String[] foods: groceries)
        {
            Arrays.sort(foods) ;
            
            for(String item: foods)
            {
                System.out.print(item + " ") ;
            }
            System.out.println() ;
        }
    }
}