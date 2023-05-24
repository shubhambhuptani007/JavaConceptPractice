package org.JavaConcepts.Collections.HashMaps;

import java.util.HashMap;

public class Example1 {
    public static void main(String[] args) {
        HashMap<Integer,String> hashMap = new HashMap();
        hashMap.put(1,"Shubham");
        hashMap.put(2,"Kushal");
        hashMap.put(3,"Harshil");
        System.out.println(hashMap);
        hashMap.compute(1,(k,v)->{
           return v +=String.valueOf(k);
        });
        hashMap.computeIfPresent(10,(k,v)-> v+=String.valueOf(k));
        hashMap.computeIfAbsent(10,(k)->"Hello");
    }
}
