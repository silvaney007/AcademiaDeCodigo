package org.academiadecodigo.felinux.diney.todolist;

public class TodoItem  implements Comparable <TodoItem>{
    private Importance importance;
    private  int priority;
    private String item;


    public TodoItem(Importance importance, int priority, String item) {
        this.importance = importance;
        this.priority = priority;
        this.item = item;
    }


    @Override
    public int compareTo(TodoItem todoItem){

        if(this.importance.compareTo(todoItem.getImportance()) == 0){
            return this.priority - todoItem.getPriority();
        }

        return this.importance.compareTo(todoItem.getImportance());
    }


    public Importance getImportance() {
        return importance;
    }

    public int getPriority() {
        return priority;
    }

    public enum Importance{
        HIGH,
        MEDIUM,
        LOW;
    }


    @Override
    public String toString() {
        return "TodoItem{" +
                "importance=" + importance +
                ", priority=" + priority +
                ", item='" + item + '\'' +
                '}';
    }
}
