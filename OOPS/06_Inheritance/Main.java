public class Main
{
    public static void main(String[] args)
    {
        Dog dog = new Dog() ;
        Cat cat = new Cat() ;

        System.out.println(dog.isAlive);
        System.out.println(dog.lives);
        dog.eat();
        dog.speak();


        System.out.println(cat.isAlive);
        System.out.println(cat.lives);
        cat.eat();
        cat.speak();

        Plant plant = new Plant() ;
        
        System.out.println(plant.isAlive);
        plant.photosynthesis() ;
    }
}