public class Main {
    public static void main(String[] args)
    {
        User u1 = new User("Sourav") ;
        User u2 = new User("Sourav", "sourav@google.com") ;
        User u3 = new User("Sourav", "sourav@google.com", 22) ;
        User u4 = new User() ;

        u1.info();
        u2.info();
        u3.info();
        u4.info();
    }
}