package Learn_Data_Types.Arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class Learn_Arraylist {
    static void main() {

//        Creating an arraylist of the integer
        ArrayList<Integer> ll = new ArrayList<>();

//        Creating a 2D arraylsit of integere
        ArrayList<ArrayList<Integer>> ll2 = new ArrayList<>();

//        Adding the element in the 1 D list
        ll.add(0);
        ll.add(2);
        ll.add(4);
        ll.add(5);
        System.out.println(ll);

//        get the element from the list
        System.out.println(ll.get(2));
        System.out.println(ll.get(1));

//        Add the element middle of the array
        ll.add(2,10);
        ll.add(5,20);
        System.out.println(ll);

//        remove the element
        ll.remove(2);
        System.out.println(ll);

//        find the size
        System.out.println(ll.size());


//        Iterate the arraylist
        for(int i = 0;i<ll.size();i++){
            System.out.println(ll.get(i));
        }

//        For the sorting
        Collections.sort(ll);




    }
}

