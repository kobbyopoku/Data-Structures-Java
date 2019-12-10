/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.datastructuresjava.linear;

/**
 *
 * @author godwin.duah
 */
public class OurLinkedList<X> {

    private Node first;
    private Node last;
    private int nodeCount;

    public OurLinkedList() {
        first = null;
        last = null;
        nodeCount = 0;
    }

    public int size() {
        return nodeCount;
    }

    public void add(X item) {
        if (first == null) {
            first = new Node(item);
            last = first;
        } else {
            Node newLastNode = new Node(item);
            last.setNextNode(newLastNode);
            last = newLastNode;
        }
        nodeCount++;
    }

    public X remove() {
        if (first == null) {
            throw new IllegalStateException("There are no items on the list");
        }
        X nodeItem = first.getNodeItem();

        first = first.getNextNode();
        nodeCount--;
        return nodeItem;
    }

    private class Node {

        private Node nextNode;
        private X nodeItem;

        public Node(X item) {
            this.nextNode = null;
            this.nodeItem = item;
        }

        public void setNextNode(Node nextNode) {
            this.nextNode = nextNode;
        }

        public Node getNextNode() {
            return nextNode;
        }

        public X getNodeItem() {
            return nodeItem;
        }
    }

}
