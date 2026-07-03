import java.util.* ;

public class Main {
    public static void main(String[] args) {
        try {
            // int[]arr = new int[0] ;
            // System.out.println(arr[0]);

            // System.out.println(1 / 0) ;

            // Scanner sc = new Scanner(System.in) ;
            // int num = sc.nextInt() ;

            String str = "Apple" ;
            System.out.println(str.charAt(10));

        }
        catch(ArithmeticException e){
            System.out.println("Can't divide by 0");
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Array index out of bound");
        }
        catch(StringIndexOutOfBoundsException e){
            System.out.println("String index out of bound");
        }
        catch(InputMismatchException e){
            System.out.println("Input mismatch exception");
        }
        catch(Exception e){ // SAFETY NET
            System.out.println("Something went wrong & I don't know the exception");
        }
        finally {
            System.out.println("This always executes & Finally Done");
        }
    }
}

// ArithmeticException
// ArrayIndexOutOfBoundsException
// StringIndexOutOfBoundsException
// InputMismatchException