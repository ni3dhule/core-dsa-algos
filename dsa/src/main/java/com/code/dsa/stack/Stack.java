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

    public int pop(){
        if(iTop == -1 && array.length == 0){
            System.out.printf("Stack is empty, can't perform pop operation.");
        }
        int item = array[iTop--];
        return item;
    }

    public void show(){
        System.out.println();
        System.out.printf("Stack Elements : [ ");
        for(int i=0; i<array.length;i++){
            System.out.printf(" "+array[i]);
        }
        System.out.printf(" ]");
        System.out.println();
    }

}
