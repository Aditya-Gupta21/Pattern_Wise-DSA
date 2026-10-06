package Learn_Data_Types.Hasmap;
import java.util.*;

public class hashmap_learn {
    static void main() {

//        creating an hashmap
        HashMap<Integer,String> map = new HashMap<>();

//        to add the values in the map
        map.put(21, "Aditya");
        map.put(22,"chandan");
        map.put(23, "Aditya");
        map.put(24,"Avachut");

//        printing the hashmap
        System.out.println(map);

        map.put(23, "Saurabh");
        System.out.println(map);


//         Searching in the map by using the key
        if(map.containsKey(22)){
            System.out.println("key is present");
        }
        else{
            System.out.println("key is not present");
        }

//        find the which value on the key
        System.out.println(map.get(21));   // here key is exist
        System.out.println(map.get(27));     // key does not exits


//        Iteration on the hashmap
        for(Map.Entry<Integer,String > e : map.entrySet()){
            System.out.println(e.getKey());   // key get karne ke liye
            System.out.println(e.getValue());   // value get karne ke liye
        }



    }
}
