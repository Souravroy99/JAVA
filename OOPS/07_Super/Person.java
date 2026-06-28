public class Person
{   
    String first, last ;

    Person(String first, String last) {
        this.first = first ;
        this.last = last ;
    }

    void showName() {
        System.out.println("Name is: " + this.first + " " + this.last) ;
    }
}