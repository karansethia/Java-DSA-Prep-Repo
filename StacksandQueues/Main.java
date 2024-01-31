package com.company.StacksandQueues;

public class Main {
    public static void main(String[] args) throws StackException {
        CustomStack cs = new CustomStack(10);
        cs.add(12);
        cs.add(11);
        cs.add(24);
        cs.add(10);
        System.out.println(cs.peek());
        cs.remove();
        cs.remove();
        cs.remove();
        cs.remove();
//        cs.remove();
    }
}
