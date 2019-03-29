package com.karthik.learnings;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class HashMapIterator {
    public static void main(String[] args){
        Map<String, String> myMap = new HashMap<String, String>();

        myMap.put("1", "One");
        myMap.put("2", "Two");
        myMap.put("3", "Three");
        
        myMap.forEach((k,v) -> System.out.println(v));

        Iterator<String> it1 = myMap.keySet().iterator();
        while(it1.hasNext()){
            String key = (String) it1.next();
            System.out.println("Map Value:"+myMap.get(key));
            if(key.equals("2")){
                myMap.put("1","4");
                // myMap.put("4", "4"); // Throws exception
            }
        }
        
        ConcurrentHashMap<String, String> cmyMap = new ConcurrentHashMap<String, String>();
        cmyMap.put("1", "One");
        cmyMap.put("2", "Two");
        cmyMap.put("3", "Three");
        cmyMap.put("4", "Four");
        cmyMap.put("5", "Five");

        Iterator<String> it = cmyMap.keySet().iterator();
        while (it.hasNext()) {
            String key = it.next();
            System.out.println("CMap Value:"+cmyMap.get(key));
            if (key.equals("3")) {
                cmyMap.put("6", "Six");
                cmyMap.remove("4");
            }
        }
        
    }
}