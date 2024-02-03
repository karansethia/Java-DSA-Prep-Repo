package com.company.StacksandQueues;

public class Main {
    public static void main(String[] args) throws StackException {
        CustomStack cs = new CustomStack(10);
//        cs.add(12);
//        cs.add(11);
//        cs.add(24);
//        cs.add(10);
//        System.out.println(cs.peek());
//        cs.remove();
//        cs.remove();
//        cs.remove();
//        cs.remove();
////        cs.remove();

//        CustomDynamicStack cds = new CustomDynamicStack(5);
//        cds.add(23);
//        cds.add(24);
//        cds.add(34);
//        cds.add(15);
//        cds.add(30);
//        cds.add(77);
//        System.out.println(cds.peek());

        CustomQueue qs = new CustomQueue(5);
//       qs.insert(4);
//       qs.insert(24);
//       qs.insert(15);
////        System.out.println(qs.front());
//        qs.display();
//        qs.remove();
//        qs.display();

        CustomCircularQueue cqs = new CustomCircularQueue(5);
        cqs.insert(4);
        cqs.insert(45);
        cqs.insert(24);
        cqs.insert(34);
        cqs.insert(3);
        cqs.insert(23);

        cqs.display();
    }
}
