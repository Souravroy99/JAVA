public class VarArgs  // varargs --> Variable arguments
{
    public static void main(String[] args)
    {
        add(1, 2, 3, 4) ;
    }

    static void add(int a, int... numbers)
    {
        System.out.println(a) ;

        for(int ele: numbers) {
            System.out.print(ele + " ") ;
        }
    }
}