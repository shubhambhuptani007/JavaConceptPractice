package org.JavaConcepts.Collections.ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class Example1 {
    public static void main(String[] args) {
        ArrayList<Integer> aL = new ArrayList<>();
        for(int i=0;i<10;i++){
            aL.add(i);
        }
        Iterator itr = aL.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        ArrayList<Integer> aL2 = new ArrayList<>();
        aL2.addAll(aL);
        aL.remove(1);
    }
}
