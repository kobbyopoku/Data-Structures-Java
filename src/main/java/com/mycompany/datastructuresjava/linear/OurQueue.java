/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.datastructuresjava.linear;

/**
 *
 * @author kay
 */
public class OurQueue<X> {

    private X[] data;
    private int front;
    private int end;

    public OurQueue() {
        this(1000);
    }

//    
    private OurQueue(int size) {
        this.front = -1;
        this.end = -1;
        data = (X[]) new Object[size];
    }

    public int size() {

//        if queue is empty return 0
        if (front == -1 && end == -1) {
            return 0;
        } //         otherwise we add one to get the inclusive substratction value rather than excluding 
        else {
            return end - front + 1;
        }
    }

    public void enQueue(X item) {
        if ((end + 1) % data.length == front) {
            throw new IllegalStateException("The queue is fill");
        } else if (size() == 0) {
            front++;
            end++;
            data[end] = item;
        } else {
            end++;
            data[end] = item;
        }
    }

    public X deQueue() {
        X item = null;
        if (size() == 0) {
            throw new IllegalStateException("Cant dequeue because the queue is empty");
        } else if (front == end) {
            item = data[front];
            data[front] = null;
            front = -1;
            end = -1;
        } else {
            item = data[front];
            data[front] = null;
            front++;
        }
        return item;
    }

    public boolean contains(X item) {
        boolean found = false;

        if (size() == 0) {
            return found;
        }

        for (int i = front; i < end; i++) {
            if (data[i].equals(item)) {
                found = true;
                break;
            }
        }

        return found;
    }

    public X access(int position) {

        if (size() == 0 || position > size()) {
            throw new IllegalStateException("");
        }
        int trueIndex = 0;
        for (int i = front; i < end; i++) {
            if (trueIndex == position) {
                return data[i];
            }
            trueIndex++;
        }

        throw new IllegalStateException("Could not get item at position " + position + " on queue");
    }
}
