import java.util.Arrays;

public class ArrayIntroduction {
    public static void main(String[] args)
    {
        String[] fruits = {"apple", "mango", "banana"} ;

        System.out.println() ;

        int n = fruits.length ;

        for(String fruit: fruits) {
            // System.out.println(fruit) ;
        }

        Arrays.sort(fruits) ; // Sort Method
        Arrays.fill(fruits, "pineapple") ; // Fill Method

        for(int i=0 ; i<n ; i++) {
            System.out.println(fruits[i]) ;
        }

    }
}