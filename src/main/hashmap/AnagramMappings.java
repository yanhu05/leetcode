package main.hashmap;

import java.util.HashMap;
import java.util.Map;

public class AnagramMappings {

    int[] anagramMappings(int[] listA, int[] listB){
        int[] listP = new int[0];
        if(listA == null || listB == null){
            return  listP;
        }
        listP = new int[listA.length];
        Map<Integer, Integer> myMap = new HashMap<>();
        for(int i= 0 ; i < listB.length; i++){
            myMap.put(listB[i],i);
        }
        for(int i= 0 ; i < listA.length; i++){
            listP[i] =  myMap.get(listA[i]);
        }
        return  listP;
    }
}
