package org.example.LinkedList;

public class CountNodes {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        for(int i=0;i<10;i++){
            list.add(i);
        }
        System.out.println("Total elements = "+list.countElements());
        System.out.println("After deleting middle element");
        list.deleteFromMiddle();
        list.iterate();
        System.out.println("After deleting from last");
        list.deleteFromEnd();
        list.iterate();
        System.out.println("Max from list = "+list.findMaxNode());
        System.out.println("Adding 100 to the middle");
        list.addElementAtMiddle(100);
        list.iterate();
    }
}
class LinkedList{
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next =null;
        }
    }
    Node head;
    void add(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
        }else{
            Node node = head;
            while(node.next!=null){
                node = node.next;
            }
            node.next=newNode;
        }
    }
    int countElements(){
        int count = 0;
        if(head == null){
            count=0;
        }else {
            Node node = head;
            while(node!=null){
                count+=1;
                node = node.next;
            }
        }
        return count;
    }
    void deleteFromMiddle(){
        int count = 0;
        if(head == null){
            count=0;
        }else {
            Node node = head;
            while(node!=null){
                count+=1;
                node = node.next;
            }
        }
        int middle=count/2;
        Node current;
        current = head;
        Node previous = current;
        int i=0;
        while(i<middle){
            previous = current;
            current = current.next;
            i++;
        }
        previous.next = current.next;
    }
    void deleteFromEnd(){
        if(head == null){
            System.out.println("Empty Linked List");
        }else{
        Node node = head;
        Node previous = null;
        while(node.next!=null){
            previous = node;
            node = node.next;
        }
            previous.next = null;
        }
    }
    void iterate(){
        Node node = head;
        while(node!=null){
            System.out.println(node.data);
            node = node.next;
        }

    }
    int findMaxNode(){
        int max = 0;
        if(head == null){
            return 0;
        }else{
            Node node = head;
            while(node!=null){
                if(node.data>max){
                    max = node.data;
                }
                node = node.next;
            }
        }
        return max;
    }
    void addElementAtMiddle(int data){
        if(head==null){
            System.out.println("Empty List");
        }else {
            Node newNode = new Node(data);
            int mid = countElements() / 2;
            int i = 0;
            Node current = head;
            Node previous = null;
            while(i<mid){
                previous = current;
                current = current.next;
                i++;
            }
            previous.next = newNode;
            newNode.next = current;
        }

    }
    void removeDuplicates(){
        if(head==null){
            System.out.println("Empty list");
        }else{
            Node node = head;
            while(node.next==null){

            }
        }
    }
}
