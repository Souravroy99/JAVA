public class User {
    String name, email ;
    int age ;

    User() {
        this.name = "Guest" ;
        this.email = "Not Provided" ;
        this.age = 0 ;
    }

    User(String name) {
        this.name = name ;
        this.email = "Not Provided" ;
        this.age = 0 ;
    }
    
    User(String name, String email) {
        this.name = name ;
        this.email = email ;
        this.age = 0 ;
    }

    User(String name, String email, int age) {
        this.name = name ;
        this.email = email ;
        this.age = age ;
    }

    void info() {
        System.out.println(name);
        System.out.println(email);
        System.out.println(age);
        System.out.println();
    }
}