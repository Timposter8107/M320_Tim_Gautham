import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        TaskManager manager = new TaskManager();

        manager.addTask("Einkaufen", "High", LocalDate.of(2024, 11, 9));
        manager.addTask("Onkel besuchen", "Mid", LocalDate.of(2024, 12, 24));

        
    }
}