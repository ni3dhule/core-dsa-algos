package com.code.dsa.stack;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Stack {
    private static final int MAX_STACK_SIZE = 5;
    int[] array = new int[MAX_STACK_SIZE];
    int iTop = -1;

    Logger logger = LoggerFactory.getLogger(Stack.class);
    public void push(int iItem){
        if(iTop == MAX_STACK_SIZE-1){
            logger.info("Stack is overflow !!!");
            return;
        }
        array[++iTop] = iItem;
    }

    public int pop(){
        if(iTop == -1){
            logger.info("Stack is empty, can't perform pop operation.");
            return -1;
        }
        return array[iTop--];
    }

    public void show(){
        logger.info("Stack Elements : [ ");
        for(int i=0; i <= iTop; i++){
            logger.info(" {}", array[i]);
        }
        logger.info(" ]");
    }

}
