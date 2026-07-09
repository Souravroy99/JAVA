import java.util.* ;

public class Main {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in) ;
        Medicine[] med = new Medicine[4] ;

        for(int i=0 ; i<4 ; i++)
        {
            String a = sc.nextLine(), b = sc.nextLine(), c = sc.nextLine() ;
            int d = sc.nextInt() ; sc.nextLine() ;

            med[i] = new Medicine(a, b, c, d) ;
        }
        String disease = sc.nextLine() ;

        int[] ans = getPriceByDisease(med, disease) ;

        if(ans.length == 0) System.out.println("No disease found!") ;
        else for(int p: ans) System.out.println(p) ;

        sc.close() ;
    }

    public static int[] getPriceByDisease(Medicine[] med, String disease)
    {
        int[] ans = new int[0] ;

        for(Medicine medicine: med)
        {
            if(medicine.disease.equalsIgnoreCase(disease)) {
                ans = Arrays.copyOf(ans, ans.length + 1) ;
                ans[ans.length - 1] = medicine.price ;         
            }
        }

        Arrays.sort(ans) ;
        return ans ;
    }
}

class Medicine{
    String name, batch, disease ;
    int price ;

    Medicine(String name, String batch, String disease, int price) {
        this.name = name ;
        this.batch = batch ;
        this.disease = disease ;
        this.price = price ;
    }
}