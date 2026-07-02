//**  Runtime/Dynamic Polymorphism --> When the method that gets executed is decided at runtime based on the actual type of the object.  

public class Main
{
    public static void main(String[] args) {
        // Animal animal = new Animal() ;
        
        Animal animal_1 = new Dog() ;
        Animal animal_2 = new Cat() ;

        Dog dog = new Dog() ;

        animal_1.speak() ;
        animal_2.speak() ;
    }
}