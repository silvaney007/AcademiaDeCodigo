package org.academiadecidigo.felinux.diney.linkedlistiterable;

import java.util.Iterator;

public class LinkedListIterable <T> implements Iterable <T>{

        private Node head;
        private int length = 0;

        public LinkedListIterable() {
            this.head = new Node(null);
        }

        public int size() {
            return length;
        }

        /**
         * Adds an element to the end of the list
         *
         * @param data the element to add
         */
        public void add(T data) {

            Node node = new Node(data);
            Node iterator = head;
            while (iterator.getNext() != null) {
                iterator = iterator.getNext();
            }
            iterator.setNext(node);
            length++;

        }

        /**
         * Obtains an element by index
         *
         * @param index the index of the element
         * @return the element
         */
        public T get(int index) {

            int aux = 0;
            Node iterator = head.getNext();

            while (iterator != null) {

                if (index == aux) {
                    return iterator.getData();
                }
                aux++;
                iterator = iterator.getNext();
            }

            return null;
        }

        /**
         * Returns the index of the element in the list
         *
         * @param data element to search for
         * @return the index of the element, or -1 if the list does not contain element
         */
        public int indexOf(T data) {

            int index = 0;
            Node iterator = head.getNext();

            while (iterator!= null) {

                if (iterator.getData().equals(data)) {
                    return index;
                }
                index++;
                iterator = iterator.getNext();
            }
            return -1;
        }

        /**
         * Removes an element from the list
         *
         * @param data the element to remove
         * @return true if element was removed
         */
        public boolean remove(T data) {

            Node iterator = head;

            while (iterator.getNext() != null) {

                Node next = iterator.getNext();

                if (next.getData().equals(data)) {
                    iterator.setNext(next.getNext());
                    length--;
                    return true;
                }
                iterator = iterator.getNext();
            }
            return false;
        }


    @Override
    public Iterator iterator(){
        return new linkedIterator();
    }

    private class linkedIterator implements Iterator <T>{
        private Node iterator =  head;

        @Override
        public boolean hasNext() {
            return iterator.getNext() != null;
        }

        @Override
        public T next() {
            iterator.getNext();
            return iterator.getData();
        }
    }

    private class Node {

            private T data;
            private Node next;

            public Node(T data) {
                this.data = data;
                next = null;
            }

            public T getData() {
                return data;
            }

            public void setData(T data) {
                this.data = data;
            }

            public Node getNext() {
                return next;
            }

            public void setNext(Node next) {
                this.next = next;
            }
        }

    }

}
