package org.example.BinaryTree;

import java.util.Scanner;

public class BinaryTree {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
        }
    }
    Node root;
    Node add(){
        System.out.println("Please enter data");
        Scanner sc = new Scanner(System.in);
        int data = sc.nextInt();
        Node newNode = new Node(data);
        if(data==-1){
            return null;
        }
            root = newNode;
            System.out.println("Left Node for "+root.data);
            root.left = add();
            System.out.println("Right Node for "+root.data);
            root.right = add();
            return root;
    }
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.add();
    }
}
