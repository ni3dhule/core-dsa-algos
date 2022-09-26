package com.code.dsa.stack;

public class Stack {
    int MAX_STACK_SIZE = 5;
    int[] array = new int[MAX_STACK_SIZE];
    int iTop = -1;
    public void push(int iItem){
        if(array.length == MAX_STACK_SIZE-1){
            System.out.println("Stack is overflow !!!");
            return;
        }
        array[++iTop] = iItem;
    }
}
