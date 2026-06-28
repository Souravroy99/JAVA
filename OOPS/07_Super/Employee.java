public class Employee extends Person 
{   
    int salary ;

    Employee(String first, String last, int salary) {
        super(first, last) ;
        this.salary = salary ;
    }

    void showAll() {
        System.out.println(this.first + " " + this.last + " " + this.salary) ;
    }
}