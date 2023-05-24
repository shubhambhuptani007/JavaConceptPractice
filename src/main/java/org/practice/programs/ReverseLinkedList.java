package org.practice.programs;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class ReverseLinkedList {
    public static void main(String[] args) {
        List<Integer> list = List.of(1,2,3,4,5,6,6,7,7,8,9,10);
        System.out.println("Before = "+list);

        System.out.println("After = "+list);
    }
}
