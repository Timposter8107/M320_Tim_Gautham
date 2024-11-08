import java.time.LocalDate;
import java.util.Date;

public class Task {
    private String title;
    private String priority;
    private LocalDate dueDate;
    private String status;

    public Task(String title, String priority, LocalDate dueDate) {
        this.title = title;
        this.priority = priority;
        this.dueDate = dueDate;
        this.status = "To Do";
    }

    public String getTitle() {
        return title;
    }

    public String getPriority() {
        return  priority;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
