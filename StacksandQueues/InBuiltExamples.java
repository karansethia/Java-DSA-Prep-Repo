package com.company.StacksandQueues;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class InBuiltExamples {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(34);
        st.push(24);
        st.push(19);
        st.push(12);

        System.out.println(st.pop());


        /** Queue will be implemented as a Linked List,
         *  basically queue is an interface, so it provides all the necessary functions that can be implemented
         *  but doesn't define a function definition
         *  */
        Queue<Integer> qds = new LinkedList<>();
        qds.add(23);
        qds.add(24);
        qds.add(25);
        qds.add(26);
        System.out.println(qds.remove());
        System.out.println(qds.remove());
        System.out.println(qds.remove());

    }
}
