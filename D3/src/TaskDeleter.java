import java.util.List;
import java.util.Objects;

public class TaskDeleter {
    public void deleteTask(List<Task> tasks, Task task) {
        for (Task t : tasks) {
            if (Objects.equals(t.getTitle(), task.getTitle())) {
                tasks.remove(t);
            }
        }
    }
}
