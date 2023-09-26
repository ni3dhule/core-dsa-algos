package com.code.dsa.queue;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Queue {
    // queue works on FIFO mechanism
    //queue methods that we need to implement

    // add(item)
    // add(index, item)
    // addAll(index, collection)
    // size()
    // clear()
    // remove()
    // remove(index)
    // remove(item)
    // get(index)
    // set(index, item)
    // indexOf(item)
    // lastIndexOf(item)
    // isEmpty()
    // hashCode()
    // equals(item)
    // contains(item)
    // containsAll(collection)
    // sort(comparator)
    // offer(item)
    // poll()
    // element()
    // peek()

    // front = head
    // rear = tail = back

    private final int size;
    private  int head;
    private  int tail;
    private final int[] array;

    private Logger logger = LoggerFactory.getLogger(Queue.class);

    public Queue(int  initialSize) {
        this.size = initialSize;
        this.array = new int[this.size];
        this.head = -1;
        this.tail = -1;
    }

    //This method will add the item at the end of the queue
    public void add(int item) {

        // first check for queue is full or not
        if((head == size-1 && tail == 0) || head == (tail - 1) % (size - 1) )  {
            logger.info("Queue is already full, in-order add new item first remove some items");
        }
        // check for empty queue
        if(head == -1) {
            head = 0;
            tail = 0;
            this.array[head] = item;
        }





    }


}
