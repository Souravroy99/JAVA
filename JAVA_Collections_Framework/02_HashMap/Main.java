import java.util.HashMap ;

public class Main {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>() ;

        map.put("apple", 2) ;
        map.put("orange", 1) ;
        map.put("banana", 5) ;


        map.remove("banana") ;

        System.out.println(map.size());

        System.out.println(map.get("banana"));

        System.out.println(map.containsKey("banana"));

        System.out.println(map) ;


        map.forEach((key, value) -> {
            System.out.println(key + " -> " + value) ;
        });

        System.out.println();

        for(String key: map.keySet()) {
            System.out.println(key + " -> " + map.get(key)) ;
        }
    }
}