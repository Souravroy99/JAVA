public class Main
{
    public static void main(String[] args)
    {
        Person p = new Person("Sourav", "Roy") ;
        p.showName() ;

        Student s = new Student("Ram", "Charan", 9.9) ;
        s.showName() ;
        s.showAll() ;

        Employee e = new Employee("Arjun", "Pandit", 1000000) ;
        e.showName() ;
        e.showAll() ;
    }
}