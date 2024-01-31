package com.company.StacksandQueues;

import java.util.ArrayDeque;
import java.util.Deque;

public class DoublyEndedQueue {
    public static void main(String[] args) {
        Deque<Integer> q1 = new ArrayDeque<>();
        q1.addFirst(12);
        q1.add(11);
        q1.addLast(24);
        System.out.println(q1.peekLast());

    }
}
