package org.academiadecodigo.felinux.diney.todolist;

public class Main {

    public static void main(String[] args) {
        TodoList todoList = new TodoList();
        todoList.add(new TodoItem(TodoItem.Importance.MEDIUM, 1, "Medium priority 1"));
        todoList.add(new TodoItem(TodoItem.Importance.HIGH, 1, "Medium priority 1"));
        todoList.add(new TodoItem(TodoItem.Importance.LOW, 1, "Medium priority 1"));
        todoList.add(new TodoItem(TodoItem.Importance.LOW, 2, "Medium priority 1"));
        todoList.add(new TodoItem(TodoItem.Importance.MEDIUM, 2, "Medium priority 1"));
        todoList.add(new TodoItem(TodoItem.Importance.HIGH, 2, "Medium priority 1"));

        while (!todoList.isEmpty()){ System.out.println(todoList.remove()); }
    }
}
