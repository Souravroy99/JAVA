public class Circle extends Shape
{
    double radius = 0.0 ;

    Circle(double radius) {
        this.radius = radius ;
    }

  //  This method must be implemented
    double area() {
        return Math.PI * radius * radius ;
    }
}