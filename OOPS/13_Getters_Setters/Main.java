public class Main {
    public static void main(String[] args) {
        Car car = new Car("Royal_Enfield", "Black", 300000) ;

        System.out.println(car.getColor() + " " + car.getModel() + " " + car.getPrice());

        car.setColor("White") ;

        System.out.println(car.getColor() + " " + car.getModel() + " " + car.getPrice());
    }
}