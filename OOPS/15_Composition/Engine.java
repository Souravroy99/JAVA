public class Engine
{
    String engineType ;
    
    Engine(String engineType) {
        this.engineType = engineType ;
    }

    void start() {
        System.out.println("You start the " + this.engineType + " Engine");
    }
}