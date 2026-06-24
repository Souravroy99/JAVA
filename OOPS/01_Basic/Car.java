public class Car
{
    String make = "Ford" ;   
    String model = "Mustang" ;   
    int year = 2027;
    double price = 5000000 ;
    boolean isRunning = false ;

    void start() {
        isRunning = true ;
        System.out.println("You start the engine.");
    }
}