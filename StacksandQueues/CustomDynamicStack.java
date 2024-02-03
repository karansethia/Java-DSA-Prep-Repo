package com.company.StacksandQueues;

public class CustomDynamicStack extends CustomStack{
    public CustomDynamicStack() {
        super();
    }

    public CustomDynamicStack(int size) {
        super(size);
    }

    @Override
    public boolean add(int element){
        if(this.isFull()){
            // double the array size
            int[] temp = new int[data.length * 2];

            // copy all data in new array
            for (int i = 0; i < data.length; i++) {
                temp[i] = data[i];
            }
            data = temp;
        }
        return super.add(element);
    }
}
