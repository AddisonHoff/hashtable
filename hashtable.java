/*
Addison Hoff
HashTable Class for Strings
*/

import java.util.ArrayList;

public class hashtable {
    ArrayList<String> ht;
    int size;

    //initializes an array of size capacity
    public hashtable(int capacity) {
        ht = new ArrayList<>(capacity);
        size = 0;
    }

    //put hashes the key to an index in your array, and places the value there. Fails if there are collisions/repeat keys.
    public String put(String key, String value){

        int arrLoc = hashCode(key);

        for (int i = 0; i <= arrLoc; i++)
        {
            if(ht.size() <= arrLoc && i >= ht.size())
            {
                ht.add(i,"");
            }
        }

        if(ht.get(arrLoc).isEmpty()) { size++; }
        else return ht.get(arrLoc);

        ht.add(arrLoc, value);

        return null;
    }

    //get hashes the key to get the index, and returns that element. Returns null if key not found.
    public String get(String key){

        int index = hashCode(key);

        if(ht.get(index).isEmpty()){
            return "";
        }
        else return ht.get(index);

    }

    //returns the unique int in the range of the [0, array length)
    private int hashCode(String key){
        String hold = "";

        for(int i = 0; i < key.length(); i++)
        {
            hold = hold + (((int)key.charAt(i)) - ((int)'0'));
        }

        return Integer.valueOf(hold);
    }

}

