public class Main{
    public static void main(String[] args)
    {
        Students s1 = new Students("Sourav", 22, 9.6) ; 
        Students s2 = new Students("Virat", 38, 9.2) ;
        Students s3 = new Students() ;

        s1.info() ;
        s2.info() ;
        s3.info() ;
    }
}