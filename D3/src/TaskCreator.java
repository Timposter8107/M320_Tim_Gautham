import java.time.LocalDate;
import java.util.Date;

public class TaskCreator {
    public Task createTask(String title, String priority, LocalDate dueDate) {
        return new Task(title, priority, dueDate);
    }
}
