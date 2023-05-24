package org.practice.programs;

import java.util.HashMap;
import java.util.Map;

public class CountCharacter {
    public static void main(String[] args) {
        String s = "abcdjaanisidnasidjaihaa";
        Map<Character,Integer> map = new HashMap<>();
        for(int i=0;i<s.length();i++){
            if(!map.containsKey(s.charAt(i))){
                map.put(s.charAt(i),1);
            }else{
                int value = map.get(s.charAt(i));
                map.put(s.charAt(i),value+1);
            }
        }
        System.out.println(map);
//        map.forEach((k,v)->{
//            if(v==1){
//                System.out.println("Unique = "+k);
//            }
//        });
        map.keySet().stream().filter(k->map.get(k)==1).forEach(System.out::println);
    }
}
