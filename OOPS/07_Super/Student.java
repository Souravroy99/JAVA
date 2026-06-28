public class Student extends Person 
{   
    double gpa ;

    Student(String first, String last, double gpa) {
        super(first, last) ;
        this.gpa = gpa ;
    }

    void showAll() {
        System.out.println(first + " " + this.last + " " + gpa);
    }
}