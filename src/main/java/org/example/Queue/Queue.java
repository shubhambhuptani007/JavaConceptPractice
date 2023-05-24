package org.example.Queue;

public class Queue {
    static class Node{
        Node next;
        int data;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    Node head;
    void push(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
        }else{
            Node node = head;
            while(node.next!=null){
                node = node.next;
            }
            node.next = newNode;
        }
    }
    void pop(){
        if(head == null){
            System.out.println("Empty Queue");
        }else{
            head = head.next;
        }
    }
    void traverse(){
        if(head == null){
            System.out.println("Queue is Empty");
        }
        Node node = head;
        while(node!=null){
            System.out.println(node.data);
            node = node.next;
        }
    }
    public static void main(String[] args) {
        Queue queue = new Queue();
        queue.push(10);
        queue.push(20);
        queue.push(30);
        queue.push(40);
        queue.push(50);
        queue.traverse();
        System.out.println("After popping one element");
        queue.pop();
        queue.traverse();
    }
}
