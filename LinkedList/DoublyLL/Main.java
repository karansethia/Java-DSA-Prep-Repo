package com.company.LinkedList.DoublyLL;

public class Main {
    public static void main(String[] args) {
        DoublyLinkList list = new DoublyLinkList();
        list.insertFirst(2);
        list.insertFirst(5);
        list.insertFirst(8);
        list.insertFirst(10);
        list.display();
        list.displayRev();
//        list.getNode(1);

    }
}
