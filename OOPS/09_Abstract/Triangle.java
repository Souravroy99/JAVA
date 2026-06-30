public class Triangle extends Shape
{
    double base = 0.0, height = 0.0 ;

    Triangle(double base, double height) {
        this.base = base ;
        this.height = height ;
    }

  //  This method must be implemented
    double area() {
        return 0.5 * base * height ;
    }
}