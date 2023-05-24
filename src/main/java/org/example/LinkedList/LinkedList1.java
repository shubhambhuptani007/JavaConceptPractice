package org.example.LinkedList;

import java.util.LinkedList;

class Node{
    Node next;
    int data;
    Node(int data){
        this.data = data;
        this.next = null;
    }
}
public class LinkedList1 {
    Node head;

    static void addAtBeginning(LinkedList1 list, int data){
        Node node = new Node(data);
        if(list.head==null){
            list.head = node;
        }else{
            node.next = list.head;
            list.head = node;
        }
    }
    static void addLast(LinkedList1 list, int data){
        Node node = new Node(data);
        if(list.head == null){
            list.head = node;
        }else{
            Node head = list.head;
            while(head.next!=null){
                head = head.next;
            }
            head.next = node;
        }
    }
    static LinkedList1 deleteFirst(LinkedList1 list){
        if (list.head==null){
            System.out.println("List is empty");
        }else{
            list.head = list.head.next;
        }
        return list;
    }
    static void deleteFromIndex(int index,LinkedList1 list){
        if(list.head == null){
            System.out.println("List is empty");
        }else{
            int i=0;
            Node head = list.head;
            while(head!=null){
                head = head.next;
            }
        }
    }
    static void printElements(LinkedList1 list1){
        if(list1.head == null){
            System.out.println("Empty list");
        }else{
            Node head = list1.head;
            while(head!=null){
                System.out.println(head.data);
                head = head.next;
            }
        }
    }

    public static void main(String[] args) {
        LinkedList1 list1 = new LinkedList1();
        addAtBeginning(list1,0);
        addAtBeginning(list1,2);
        addAtBeginning(list1,3);
        addLast(list1,55);
        System.out.println("Printing the list");
        printElements(list1);
        System.out.println("After deleting first element");
        deleteFirst(list1);
        printElements(list1);
        System.out.println("After deleting last element");
        printElements(list1);
    }

}
