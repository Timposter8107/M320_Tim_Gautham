import java.util.Scanner;

public class InputReader {
    private Scanner reader;

    public InputReader() {
        this.reader = new Scanner(System.in);
    }

    public String getInput() {
        System.out.print("> ");
        String inputLine = this.reader.nextLine();
        return inputLine;
    }
}
