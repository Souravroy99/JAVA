public class Students 
{
    String name = "RRR" ;
    int age = 100 ;
    double gpa = 10.0 ;
    boolean isEnrolled = false ;

    Students()  // Default Constructor
    {
        System.out.println("Default constructor called");
    }

    Students(String name, int age, double gpa) // Parameterized Constructor
    {
        this.name = name ;
        this.age = age ;
        this.gpa = gpa ;
        this.isEnrolled = true ;
    }

    void info() {
        System.out.println(name + "\n" + age + "\n" + gpa + "\n" + isEnrolled) ;
        System.out.println();
    }
}