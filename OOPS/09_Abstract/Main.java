public class Main
{
    public static void main(String[] args)
    {
        Shape shape = new Shape() ;  // We can't create an object of an abstract class.
        
        Circle c = new Circle(7) ;
        Rectangle r = new Rectangle(11, 12) ;
        Triangle t = new Triangle(5, 10) ;

        c.display() ;
        r.display() ;
        t.display() ;

        System.out.println("Circle area: " + c.area());
        System.out.println("Rectangle area: " + r.area());
        System.out.println("Triangle area: " + t.area());
    }
}