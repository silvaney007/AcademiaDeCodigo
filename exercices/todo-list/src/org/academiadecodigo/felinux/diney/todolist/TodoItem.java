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
        int compare = this.importance.getImportance() - todoItem.getImportance().getImportance();

        if( compare == 0){
            return priority - todoItem.getPriority();
        }

        return compare;
    }


    public Importance getImportance() {
        return importance;
    }

    public int getPriority() {
        return priority;
    }

    public enum Importance{
        HIGH(1),
        MEDIUM(2),
        LOW(3);

        private int importance;

        Importance(int priority) {
            this.importance = priority;
        }

        public int getImportance() {
            return importance;
        }
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
