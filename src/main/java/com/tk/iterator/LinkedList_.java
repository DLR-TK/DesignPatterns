package com.tk.iterator;

import lombok.Data;

@Data
public class LinkedList_<E> implements Collention_<E>{

    private Node head = null;
    private Node tail = null;

    private int size = 0;

    @Override
    public void add(E o) {
        Node node = new Node(o);
        node.next = null;

        if (head == null) {
            head = node;
            tail = node;
        }

        tail.next = node;
        tail = node;
        size++;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public Iterator_<E> iterator() {
        return new LinkedListIterator<>();
    }

    private class Node {
        private Object o;
        Node next = null;

        public Node(Object o) {
            this.o = o;
        }
    }

    /**
     * 实现迭代功能
     * @param <E>
     */
    private class LinkedListIterator<E> implements Iterator_<E> {

        private int currentIndex = 0;

        @Override
        public boolean hasNext() {
            if (currentIndex >= size) {
                return false;
            }
            return true;
        }

        @Override
        public E next() {
            E o = (E) head.o;
            head = head.next;
            currentIndex++;
            return o;
        }
    }
}
