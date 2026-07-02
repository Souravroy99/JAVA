public class Car    
{
    String model ;
    int year ;
    Engine engine ;

    Car(String model, int year, String engineType) { 
        this.model = model ;
        this.year = year ;
        this.engine = new Engine(engineType) ;
    }
}