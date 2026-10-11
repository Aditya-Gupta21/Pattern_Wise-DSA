package Learn_Data_Types.Hasmap;

import java.util.HashMap;

public class First_Unique_Character_in_a_String {
    static void main() {
        String s = "leetcode";
        System.out.println(unique_character_index(s));
    }

//    method to return the unique character index
    public static int unique_character_index(String s){

//        Creating the new hashmap
        HashMap<Character,Integer> freq = new HashMap<>();

//        put the values in the hashmap
        for(char c : s.toCharArray()){
            freq.put(c,freq.getOrDefault(c,0)+1);
        }

//        here check the condition which one is unique
        for(int i = 0;i<s.length();i++){
            if (freq.get(s.charAt(i)) == 1){
                return i;
            }
        }
        return -1;

    }


}
