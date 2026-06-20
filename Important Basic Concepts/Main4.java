import java.util.Random; // Random + Math + printf

public class Main4{
    public static void main(String[] args){
        Random random = new Random() ;
        int random_integer = random.nextInt(10, 15) ;
        System.out.println(random_integer) ;


        System.out.println() ;


        System.out.println("PI : " + Math.PI) ;
        System.out.println("Pow : " + Math.pow(5, 3)) ;
        System.out.println("Abs : " + Math.abs(-19.67)) ;
        System.out.println("Sqrt : " + Math.sqrt(49)) ;
        System.out.println("Round : " + Math.round(3.14)) ;
        System.out.println("Ceil : " + Math.ceil(3.14)) ;
        System.out.println("Floor : " + Math.floor(3.14)) ;
        System.out.println("Minimum : " + Math.min(10, 20)) ;
        System.out.println("Maximum : " + Math.max(10, 20)) ;

        // Using 'printf'
        System.out.printf("Maximum : %d", Math.max(10, 20)) ;

    }
}