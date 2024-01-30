package com.company.LinkedList.DoublyLL;

import com.company.LinkedList.SinglyLL.LinkList;
import org.w3c.dom.Node;

public class DoublyLinkList {
    private Node head;
    private Node tail;
    private int size;

    public void insertFirst(int value){
        Node newNode = new Node(value);
        if(head != null){
            newNode.prev = null;
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }else{
            head = newNode;
        }
        size++;
    }

    public void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.value+" -> ");
            temp = temp.next;
        }
        System.out.print("END \n");
    }
    public void displayRev(){
        tail  = getNode(size-1);
        System.out.println(tail.value);
        Node temp = tail;
        while(temp != null){
            System.out.print(temp.value+" -> ");
            temp = temp.prev;
        }
        System.out.print("END \n");

    }
    public Node getNode(int index){
        Node temp = head;
        int i = 0;
        while(i <= index){
            if(i == index){
                return temp;
            }
            temp = temp.next;
            i++;
        }
        return null;
    }


    class Node {
        int value;
        Node next;
        Node prev;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next, Node prev) {
            this.value = value;
            this.next = next;
            this.prev = prev;
        }
    }
}
