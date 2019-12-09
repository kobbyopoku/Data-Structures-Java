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
public class OurStack {

    
    //Implementation of how stacks work in Java
    
    static final int MAX = 1000;
    int top;
    int a[] = new int[MAX];

    boolean isEmpty() {
        return top < 0;
    }

    OurStack() {
        top = -1; 
    }

    
    // how the push method that adds items to the stack
    
    boolean push(int x) {
        if (top >= (MAX - 1)) {
            System.out.println("Stack Overflow");
            return false;
        } else {
            a[++top] = x;
            System.out.println(x + " pushed into stack");
            return true;
        }
    }

    
    //how the pop method works
    int pop() {
        if(top < 0){
            System.out.println("Stack Underflow");
            return 0;
        }else{
            int x = a[top --];
            return x;
        }
    }
    
    
    //how the peek method works
    
    int peek(){
        if(top < 0){
            System.out.println("Stack Underflow");
            return 0;
        }else{
            int x = a[top];
            return x;
        }
    }

}
