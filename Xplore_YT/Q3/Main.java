import java.util.* ;

public class Main {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in) ;
        Institution[] institution = new Institution[4] ;

        for(int i=0 ; i<4 ; i++)
        {
            int a = sc.nextInt() ; sc.nextLine() ;
            String b = sc.nextLine() ;
            int c = sc.nextInt() ; sc.nextLine() ;
            int d = sc.nextInt() ; sc.nextLine() ;
            String e = sc.nextLine() ;

            institution[i] = new Institution(a, b, c, d, e) ;
        }

        String location = sc.nextLine() ;
        String name = sc.nextLine() ;

        int sum = findNumClearanceByLoc(institution, location) ;
        Institution ins = updateInstitutionGrade(institution, name) ;

        if(sum > 0) System.out.println(sum);
        else System.out.println("There is no cleared students.");

        if(ins == null) System.out.println("No institution is available.");
        else System.out.println(ins.getName() + "::" + ins.getGrade());

        sc.close() ;
    }

    public static int findNumClearanceByLoc(Institution[] institution, String location) {
        int sum = 0 ;

        for(Institution inc: institution) {
            if(inc.getLocation().equalsIgnoreCase(location)) sum += inc.getNoOfStudentsCleared() ;
        }

        return sum ;
    }

    public static Institution updateInstitutionGrade(Institution[] institution, String name) {
        
        for(Institution inc: institution) 
        {
            if(inc.getName().equalsIgnoreCase(name)) 
            {
                int rating = (inc.getNoOfStudentsPlaced() * 100)/inc.getNoOfStudentsCleared() ;
                
                if(rating >= 80) inc.setGrade("A") ;
                else inc.setGrade("B") ;

                return inc ;
            }
        }

        return null ;
    }
}

class Institution
{
    int id ;
    String name ;
    int noOfStudentsPlaced ;
    int noOfStudentsCleared ;
    String location, grade ;

    Institution(int id, String name, int noOfStudentsPlaced, int noOfStudentsCleared, String location) {
        this.id = id ;
        this.name = name ;
        this.noOfStudentsPlaced = noOfStudentsPlaced ;
        this.noOfStudentsCleared = noOfStudentsCleared ;
        this.location = location ;
    }

    public int getId() {
        return this.id ;
    }
    public void setId(int id) {
        this.id = id ;
    }

    public String getName() {
        return this.name ;
    }
    public void setName(String name) {
        this.name = name ;
    }

    public int getNoOfStudentsPlaced() {
        return this.noOfStudentsPlaced ;
    }
    public void setNoOfStudentsPlaced(int noOfStudentsPlaced) {
        this.noOfStudentsPlaced = noOfStudentsPlaced ;
    }

    public int getNoOfStudentsCleared() {
        return this.noOfStudentsCleared ;
    }
    public void setNoOfStudentsCleared(int noOfStudentsCleared) {
        this.noOfStudentsCleared = noOfStudentsCleared ;
    }

    public String getLocation() {
        return this.location ;
    }
    public void setLocation(String location) {
        this.location = location ;
    }

    public String getGrade() {
        return this.grade ;
    }
    public void setGrade(String grade) {
        this.grade = grade ;
    }
}