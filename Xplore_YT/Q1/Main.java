import java.util.* ;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        
        TravelAgencies[] travelAgencies = new TravelAgencies[4] ;

        for(int i=0 ; i<4 ; i++) {
            int regNo = sc.nextInt() ; sc.nextLine() ;
            String agencyName = sc.nextLine() ;
            String packageType = sc.nextLine() ;
            int price = sc.nextInt() ; sc.nextLine() ;
            boolean flightFacility = sc.nextBoolean() ; sc.nextLine() ;
            
            travelAgencies[i] = new TravelAgencies(regNo, agencyName, packageType, price, flightFacility) ;
        }

        int regNo = sc.nextInt() ; sc.nextLine() ;
        String packageType = sc.nextLine() ;

        int mx = findAgencyWithHighestPackagePrice(travelAgencies) ;
        System.out.println(mx) ;

        ArrayList<TravelAgencies>ans = agencyDetailsforGivenIdandType(travelAgencies, regNo, packageType) ;

        if(ans.size() == 0) System.out.println("NAA") ;
        else{
            for(TravelAgencies t: ans) {
                System.out.println(t.agencyName + ":" + t.price) ;
            }
        }

        sc.close() ;
    }

    public static int findAgencyWithHighestPackagePrice(TravelAgencies[] travelAgencies) {

        int mx = travelAgencies[0].price ;
        for(int i=1 ; i<travelAgencies.length ; i++) {
            mx = Math.max(mx, travelAgencies[i].price) ;  
        }

        return (mx <= 0) ? -1 : mx ;
    }

    public static ArrayList<TravelAgencies> agencyDetailsforGivenIdandType(TravelAgencies[] ta, int regNo, String packageType) {
        
        ArrayList<TravelAgencies> ans = new ArrayList<>() ;

        for(int i=0 ; i<ta.length ; i++)
        {
            if(ta[i].flightFacility && ta[i].regNo == regNo && ta[i].packageType.equals(packageType))
            {
                ans.add(ta[i]) ;
            }
        }

        return ans ;
    }
}

class TravelAgencies
{
    int regNo ;
    String agencyName ;
    String packageType ;
    int price ;
    boolean flightFacility ;

    TravelAgencies(int regNo, String agencyName, String packageType, int price, boolean flightFacility)
    {
        this.regNo = regNo ;
        this.agencyName = agencyName ;
        this.packageType = packageType ;
        this.price = price ;
        this.flightFacility = flightFacility ;
    }

    public int getRegNo() {
        return regNo ;
    }
    public void setRegNo(int regNo) {
        this.regNo = regNo ;
    }

    public String getAgencyName() {
        return agencyName ;
    }
    public void setAgencyName(String agencyName) {
        this.agencyName = agencyName ;
    }
}