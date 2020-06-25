package org.academiadecodigo.felinux.diney.todolist;

import java.util.PriorityQueue;

public class TodoList {

    private PriorityQueue priorityQueue;

    public TodoList() {
        this.priorityQueue = new PriorityQueue();
    }

    public boolean isEmpty() {
        return priorityQueue.isEmpty();
    }

    public void add(TodoItem todoItem){
    priorityQueue.add(todoItem);
    }

    public String remove(){
        Object aux = priorityQueue.peek();
        priorityQueue.remove();
        return aux.toString();
    }
}
