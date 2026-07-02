public class Main {
    public static void main(String[] args) {
        Car car = new Car("BMW", 2026, "V8") ;

        System.out.println(car.model);
        System.out.println(car.year);
        System.out.println(car.engine.engineType);
    }
}