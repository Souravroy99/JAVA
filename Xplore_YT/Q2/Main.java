import java.util.* ;

public class Main {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in) ;
        Phone[] phone = new Phone[4] ;

        for(int i=0 ; i<4 ; i++)
        {
            int a = sc.nextInt() ; sc.nextLine() ;
            String b = sc.nextLine() ;
            String c = sc.nextLine() ;
            int d = sc.nextInt() ; sc.nextLine() ;

            phone[i] = new Phone(a, b, c, d) ;
        }

        String brand = sc.nextLine() ;
        String os = sc.nextLine() ;

        int price = findPriceForGivenBrand(phone, brand) ;
        Phone ph = getPhoneIdBasedOnOs(phone, os) ;

        if(price > 0) System.out.println(price);
        else System.out.println("The given brand is not available");

        if(ph == null) System.out.println("No phone found") ;
        else System.out.println(ph) ;

        sc.close() ;
    }

    public static int findPriceForGivenBrand(Phone[] phone, String brand) {
        int totalPrice = 0 ;

        for(Phone ph: phone) {
            if(ph.brand.equals(brand)) {
                totalPrice += ph.price ;
            }
        }

        return totalPrice ;
    }
    public static Phone getPhoneIdBasedOnOs(Phone[] phone, String os) {

        for(Phone ph: phone) {
            if(ph.os.equalsIgnoreCase(os) && ph.price >= 50000) {
                return ph ;
            } 
        }

        return null ;
    }
}

class Phone {
    int phoneId ;
    String os ;
    String brand ;
    int price ;

    Phone(int phoneId, String os, String brand, int price) {
        this.phoneId = phoneId ;
        this.os = os ;
        this.brand = brand ;
        this.price = price ;
    }
}