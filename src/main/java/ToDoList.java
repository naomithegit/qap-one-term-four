import java.util.ArrayList;
import java.util.List;
//import java.util.List;



public class ToDoList {
    private List<Task> tasks;





    public ToDoList() {
        this.tasks = new ArrayList<>();
    }

    public void addTask(String taskName) {
        tasks.add(new Task(taskName));
    }

    public List<Task> getTasks() {
        return tasks;
    }

    public void completeTask(String taskName) {
        for (Task task : tasks) {
            if (task.getName().equals(taskName)) {
                task.completeTask();
                break;
            }
        }
    }

    public boolean isTaskCompleted(String taskName) {
        for (Task task : tasks) {
            if (task.getName().equals(taskName)) {
                return task.isCompleted();
            }
        }
        return false;
    }
}
