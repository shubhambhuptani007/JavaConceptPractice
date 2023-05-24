package org.example.DoublyLinkedList;

public class DoublyLinkedList {
    static class Node{
        int data;
        Node previous;
        Node next;
        Node(int data){
            this.data = data;
            this.previous = null;
            this.next = null;
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
                node.next = newNode;
                newNode.previous = node;
            }
        }
        void addFirst(int data){
            Node newNode = new Node(data);
            if(head == null){
                head = newNode;
            }else{
                newNode.next = head;
                head.previous = newNode;
                head = newNode;
            }
        }
        void remove(){
            if(head == null){
                System.out.println("Empty LinkedList");
            }else{
                Node node = head;
                while(node.next==null){
                    node = node.next;
                }
                node = null;
            }
        }
        void removeFirst(){
            if(head == null){
                System.out.println("Empty list");
            }else{
                head = head.next;
                head.previous = null;
            }
        }
        void traverse(){
            if(head == null){
                System.out.println("Empty Linked list");
            }else{
                Node node = head;
                while(node!=null){
                    System.out.println(node.data);
                    node = node.next;
                }
            }
        }
    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();
        list.add(10);
        list.add(20);
        list.add(39);
        list.add(40);
        list.add(50);
        list.add(60);
        list.add(70);
        list.add(80);
        list.traverse();
        System.out.println("After removing first element");
        list.removeFirst();
        list.traverse();
        System.out.println("After removing an element");
        list.remove();
        list.traverse();
        System.out.println("After adding from first side");
        list.addFirst(100);
        list.traverse();
    }
}
