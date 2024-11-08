import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class TaskManager {
    private List<Task> tasks = new ArrayList<>();
    private TaskCreator creator = new TaskCreator();
    private TaskUpdater updater = new TaskUpdater();
    private TaskDeleter deleter = new TaskDeleter();

    public void addTask(String title, String priority, LocalDate dueDate) {
        Task task = creator.createTask(title, priority, dueDate);
        tasks.add(task);
        System.out.println("Added Task '" + title + "'");
    }

    public void deleteTask(String title) {
        Task task = new Task(title, "", LocalDate.now());

        if (title != null) {
            task.setTitle(title);
            deleter.deleteTask(tasks, task);
            System.out.println("Deleted Task '" + title + "'");
        }
    }
}
