package Learn_Data_Types.Hasmap;

import java.util.HashMap;

public class Maximum_Number_of_Balloons {
    static void main() {
        String text = "loonbalxballpoon";
        balloon_formed(text);

    }

    //    observe how many times the word ballon is formed by text
    public static void balloon_formed(String text){

//        Making the hashmap
        HashMap<Character,Integer> map = new HashMap<>();

//        Putting text
        for(char c : text.toCharArray()){
            map.put(c,map.getOrDefault(c,0) +1);
        }

//        printing the hashmap
        System.out.println(map);




    }
}
