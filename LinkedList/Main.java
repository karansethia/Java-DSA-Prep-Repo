package com.company.LinkedList;

import org.w3c.dom.Node;

public class Main {
    public static void main(String[] args) {
        LinkList list = new LinkList();
        list.insertFirst(3);
        list.insertFirst(4);
        list.insertFirst(1);
        list.insertFirst(8);
        list.insertEnd(12);
        list.display();
        list.displaySize();
        list.insertAtN(22,4);
        list.display();
        list.removeFirst();
        list.display();
        list.removeLast();
        list.display();
        list.removeAtN(3);
        list.display();
        System.out.println(list.getNodeValue(1));
//        list.getNode(2);
    }
}
