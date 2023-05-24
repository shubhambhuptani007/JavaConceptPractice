package org.example.CircularQueue;

public class CircularQueue {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    Node head;
    Node tail;
    void push(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            head.next=head;
            tail = head;
        }else{
            Node node = head;
            while(node.next!=head){
                node = node.next;
            }
            node.next = newNode;
            tail = newNode;
            newNode.next = head;
        }
    }
    void pop(){
        if(head == null){
            System.out.println("Empty Linked list");
        }else{
            head = head.next;
            tail.next = head;
        }
    }
    void traverse(){
        Node node = head;
        while(node!=tail){
            System.out.println(node.data);
            node = node.next;
        }
        System.out.println(node.data);
    }

    public static void main(String[] args) {
        CircularQueue queue = new CircularQueue();
        queue.push(10);
        queue.push(20);
        queue.push(30);
        queue.push(40);
        queue.push(50);
        queue.traverse();
        queue.pop();
        System.out.println("After popping one element");
        queue.traverse();
    }
}
