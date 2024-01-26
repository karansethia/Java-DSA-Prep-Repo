package com.company.LinkedList;

public class LinkList {

    private Node head;
    private Node tail;

    private int size;

    public LinkList() {
        this.size = 0;
    }

    public void displaySize(){
        System.out.println(this.size);
    }

    public void insertFirst(int val){


        Node newNode = new Node(val);
        newNode.next = head;
        head = newNode;
        if(tail == null){
            tail = head;
        }
        size++;
    }

    public void insertEnd(int value){

        if(tail == null){
            insertFirst(value);
            return;
        }

        Node newNode = new Node(value);
        tail.next = newNode;
        tail = newNode;
        size++;
    }

    public void insertAtN(int value, int index){
        if(head == null || index == 0){
            insertFirst(value);
            return;
        }
        if(index > size){
            throw new Error("Cannot add list item at index more than size");
        }
        if(index == size){
            insertEnd(value);
        }
        Node temp = head;
        Node newNode = new Node(value);
        int nodeNum = 1;
        while(nodeNum != index){
            if(nodeNum == index-1){
                newNode.next = temp.next;
                temp.next = newNode;
            }
            temp = temp.next;
            nodeNum++;
        }

        size++;
    }

    public void removeFirst(){
        head = head.next;
        size--;
    }

    public void removeLast(){
        int nodeNum = 1;
        Node temp = head;
        while(nodeNum != size){
            if(nodeNum == size-1){
               temp.next = null;
               tail = temp;
            }
            temp = temp.next;
            nodeNum++;
        }

        size--;
    }
    // a -> b -> c -> d
    // b.next = d
    public void removeAtN(int index){
        int i = 1;
        Node temp = head;
//        Node temp2 = head;
        while(i != index){
            if(i == index-1){
                int j = 0;
                Node temp2 = temp;
                while(j <= 2){
                    if(j == 2){
                        temp.next = temp2;
                    }
                    temp2 = temp2.next;
                    j++;
                }
            }
            temp = temp.next;
            i++;
        }
        size--;
    }

    public int getNodeValue(int index){
//        if(index > size){
//            return -1;
//        }
        Node temp = head;
        int i = 0;
        while(i <= index && index <= size){
            if(i == index){
                return temp.value;
            }
            temp = temp.next;
            i++;
        }
        return -1;
    }

    public void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.value+" -> ");
            temp = temp.next;
        }
        System.out.print("END \n");
    }



    private class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }
}
