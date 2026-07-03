// Composition --> Represents a "part-of" relationship between objects
//          For example "Engine" is a "part-of" a "Car"

public class Main {
    public static void main(String[] args) {
        Car car = new Car("BMW", 2026, "V8") ;
 
        System.out.println(car.model);
        System.out.println(car.year);
        System.out.println(car.engine.engineType);

        car.engine.start() ;
        car.start() ;
    }
}