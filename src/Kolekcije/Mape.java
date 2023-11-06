package Kolekcije;

import java.util.HashMap;
import java.util.Map;

public class Mape {

    public static void main(String[] args){

        Map<Integer, String> map = new HashMap<>();
        map.put(1, "texst 1");
        map.put(2, "texst 2");
        map.put(3, "texst 3");
        map.put(4, "texst 4");
        map.put(5, "texst 5");

        for(Map.Entry m:map.entrySet()){
            System.out.println("Key: " + m.getKey() +" Value: " + m.getValue());
        }
    }
}
