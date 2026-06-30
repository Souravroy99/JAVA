public class Rectangle extends Shape
{
    double length = 0.0, width = 0.0 ;

    Rectangle(double length, double width) {
        this.length = length ;
        this.width = width ;
    }

  //  This method must be implemented
    double area() {
        return length * width ;
    }
}