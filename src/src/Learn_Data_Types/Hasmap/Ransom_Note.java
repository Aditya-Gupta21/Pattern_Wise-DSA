package Learn_Data_Types.Hasmap;

import java.util.HashMap;

public class Ransom_Note {
    static void main() {
        String ransomNote = "aa";
        String magazine = "aab";
        System.out.println(check_ransomnote(ransomNote,magazine));
    }

//    Method to check it is ransomnote note or not
    public static boolean check_ransomnote(String ransomNote, String magazine){

//        Making the hashmap name need
//        need --> ransomnote
        HashMap<Character,Integer> need = new HashMap<>();

//        putting the values
        for(char c : ransomNote.toCharArray()){
            need.put(c,need.getOrDefault(c,0)+1);
        }

        System.out.println(need);

//        making the another hashmap name have
//        have --> magazine
        HashMap<Character,Integer> have = new HashMap<>();

//        putting the values
        for(char m : magazine.toCharArray()){
            have.put(m,have.getOrDefault(m,0)+1);
        }

        System.out.println(have);

//        Applying the loop in need
        for(char c : need.keySet()){
            if (have.getOrDefault(c,0) <  need.get(c)){
                return false;
            }
        }
        return true;


    }
}
