public class Method {
    public static void main(String[] args)
    {
        method("Sourav", 22) ;

        System.out.println(add(1, 2)) ;
        System.out.println(add(1, 2, 3)) ;
    }
    
    static void method(String name, int age) {
        System.out.printf("My name is %s and I am %d years old.\n", name, age);
    }


  // Method Overloading
    static int add(int num1, int num2) {
        return num1 + num2 ;
    }

    static int add(int num1, int num2, int num3) {
        return num1 + num2 + num3 ;
    }
}