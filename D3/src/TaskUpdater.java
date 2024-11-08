import java.time.LocalDate;
import java.util.Date;

public class TaskUpdater {
    public void updateStatus(Task task, String newStatus) {
        task.setStatus(newStatus);
    }

    public void updateDueDate(Task task, LocalDate newDueDate) {
        task.setDueDate(newDueDate);
    }
}
