package org.academiadecodigo.bootcamp.concurrency.bqueue;

import java.util.PriorityQueue;
import java.util.Queue;

/**
 * Blocking Queue
 *
 * @param <T> the type of elements stored by this queue
 */
public class BQueue<T> {

    final private Queue <T> queue;
    final private int limit;

    /**
     * Constructs a new queue with a maximum size
     *
     * @param limit the queue size
     */
    public BQueue(int limit) {
        this.queue = new PriorityQueue<>(limit);
        this.limit = limit;
    }

    /**
     * Inserts the specified element into the queue
     * Blocking operation if the queue is full
     *
     * @param data the data to add to the queue
     */
    public synchronized void offer(T data) {
        while(limit == queue.size()) {
            try {
               wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        queue.add(data);
        notifyAll();
    }

    /**
     * Retrieves and removes data from the head of the queue
     * Blocking operation if the queue is empty
     *
     * @return the data from the head of the queue
     */
    public synchronized T poll() {

        while(queue.isEmpty()) {
            try {
               wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        T data = queue.poll();
        notifyAll();
        return data;
    }

    /**
     * Gets the number of elements in the queue
     *
     * @return the number of elements
     */
    public synchronized int getSize() {
        return queue.size();
    }

    /**
     * Gets the maximum number of elements that can be present in the queue
     *
     * @return the maximum number of elements
     */
    public int getLimit() {
        return limit;
    }

}
