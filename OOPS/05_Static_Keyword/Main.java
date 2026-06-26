/*
    static = Makes a variable or method belong to 
    class rather than specific object. 
*/

public class Main {
    public static void main(String[]args)
    {
        Friend f1 = new Friend("Alice") ;
        Friend f2  = new Friend("Bob") ;
        Friend f3  = new Friend("Charlie") ;


        System.out.println(Friend.numOfFriends);
        Friend.showFriends() ;
    }
}