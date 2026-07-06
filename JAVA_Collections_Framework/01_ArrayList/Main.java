// ArrayList --> A resizable array that stores objects.
//               Arrays are fixed in size but ArrayLists can change.

import java.util.ArrayList ;
import java.util.Collections ;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer>list = new ArrayList<>();

        list.add(1) ;
        list.add(100) ;
        list.add(10) ;


        list.set(2, 20) ;

        System.out.println(list.get(1));
        System.out.println(list.size());


        System.out.println(list);
        Collections.sort(list) ;
        System.out.println(list);


        list.remove(0) ;
        System.out.println(list);

        for(int ele: list) {
            System.out.println(ele) ;
        }
    }
}
