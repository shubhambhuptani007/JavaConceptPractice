package org.example.Stack;

public class Stack {
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    Node head;
    void push(int data){
        Node node = new Node(data);
        if(null == head){
            head = node;
        }else{
            node.next = head;
            head = node;
        }
    }
    void pop(){
        if(head == null){
            System.out.println("Empty stack");
        }else{
            head = head.next;
        }
    }
    void traverse(){
        if(head == null){
            System.out.println("Empty Stack");
        }else{
            Node node = head;
            while(node.next!=null){
                System.out.println(node.data);
                node = node.next;
            }
            System.out.println(node.data);
        }
    }

    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        System.out.println("Traversing through the stack");
        stack.traverse();
        System.out.println("After popping out one element from stack");
        stack.pop();
        stack.traverse();
        stack.push(600);
        stack.traverse();
    }
}

