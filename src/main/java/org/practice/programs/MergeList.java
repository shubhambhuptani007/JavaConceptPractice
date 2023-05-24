package org.practice.programs;

import java.util.List;

public class MergeList {
    public static void main(String[] args) {
        List<Integer> list1 = List.of(1,2,3,4,56,1);
        List<Integer> list2 = List.of(1,232,132,1);
        list1.addAll(list2);

    }
}
