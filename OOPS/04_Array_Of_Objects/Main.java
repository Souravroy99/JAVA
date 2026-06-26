public class Main {
    public static void main(String[] args)
    {
        Car[] cars = new Car[3] ;

        cars[0] = new Car("Mustang", "Black") ;
        cars[1] = new Car("BMW", "White") ;
        cars[2] = new Car("Ferrari", "Red") ;

        for(int i=0 ; i<cars.length ; i++)
        {
            cars[i].drive() ;
        }
    }
}